# transactional-data-specification

A Java library that holds the **TDS (Transactional Data Specification) telegram schema**, the TCRP
demand-response XSD (`src/main/resources/schemas/xsd/tcrp.demandtrans.com_TCRPSchema.xsd`), and the
JAXB classes generated from it (package `com.camsys.tds`). It's a library; there's nothing to run.

Used by [tds-client](https://github.com/camsys/tds-client) (`tds.version`). System context:
[`mndot-otp-v2-docker/ARCHITECTURE.md`](https://github.com/camsys/mndot-otp-v2-docker/blob/main/ARCHITECTURE.md) ·
[ARCHITECTURE.md](ARCHITECTURE.md)

## Branch strategy

| Role | Where |
|---|---|
| Development | branch **`develop`**. All work and PRs target it. |
| Release | tag `transactional-data-specification-X.Y`, published to `repo.camsys-apps.com` with maven-release-plugin. There's no Jenkins job for it in the MnDOT folder, so releases are done by hand. |
| Used by the environments | whatever `tds.version` the deployed tds-client was built with |
| Not used | `main` (stale) |

```sh
# which spec version the tds-client on develop uses (in a tds-client checkout)
git show origin/develop:pom.xml | grep -oE '<tds.version>[^<]+'
# what develop has on top of a release (in this repo)
git fetch --tags && git log --oneline transactional-data-specification-<version>..origin/develop
```

## Build

```sh
export JAVA_HOME=$(/usr/libexec/java_home -v 17)
mvn -DskipTests install        # ~30 s; installs the current -SNAPSHOT into ~/.m2
```

**Watch out:** the build regenerates the JAXB sources that are **committed** under `src/main/java`.
They come back with a new timestamp (`episode_generate-java-classes.xjb`) and reordered comments
(`ClientOrderConfirmationType.java`). Revert that noise before committing:
`git checkout -- src/main/java`.

You only need to build this locally to test a schema change against tds-client. Otherwise tds-client
downloads its pinned `tds.version` from `repo.camsys-apps.com`.
