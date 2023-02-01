package com.crud.tasks.domain;

import com.crud.tasks.controller.Trello;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AttachmentByType {
    @JsonProperty("trello")
    private Trello trello;
}
