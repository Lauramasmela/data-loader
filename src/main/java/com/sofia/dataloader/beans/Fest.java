package com.sofia.dataloader.beans;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Fest {

    @JsonProperty("datasetid")
    private String dataSetId;
    @JsonProperty("recordid")
    private String recordId;
    @JsonProperty("fields")
    private FestDetails festDetails;
    @JsonProperty("geometry")
    private Geometry geometry;
    @JsonProperty("record_timestamp")
    private String recordTimestamp;


}
