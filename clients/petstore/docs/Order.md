
# Order

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **Long** |  |  [optional] |
| **petId** | **Long** |  |  [optional] |
| **quantity** | **Int** |  |  [optional] |
| **shipDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **status** | [**inline**](#Status) | Order Status |  [optional] |
| **complete** | **Boolean** |  |  [optional] |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | placed, approved, delivered |


