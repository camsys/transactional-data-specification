# transactional-data-specification — architecture

System-level architecture: [`mndot-otp-v2-docker/ARCHITECTURE.md`](https://github.com/camsys/mndot-otp-v2-docker/blob/main/ARCHITECTURE.md).

```
src/main/resources/schemas/xsd/tcrp.demandtrans.com_TCRPSchema.xsd   source of truth (TCRP TDS schema)
        │  jaxb2-maven-plugin (xjc, package com.camsys.tds)
        ▼
src/main/java/com/camsys/tds/*.java   generated telegram types (committed, ~46 classes):
        ExpeditedTripRequestType, ProviderOrderConfirmationType, TripCancelResponseType,
        TripRequestResponseType, RealtimeTripUpdateType, RealtimeVehiclePositionType, …
src/main/java/META-INF/JAXB/episode_*.xjb   JAXB episode file
```

Consumers deserialize telegrams into these types: tds-client's `TelegramTypeMapperService`, its
per-type processors, and the OpenAPI annotations in `ClientController`. To change a telegram, edit the
XSD, rebuild, commit the regenerated classes, release, bump `tds.version` in tds-client, then release
tds-client and pin it in `mndot-tds-docker`.
