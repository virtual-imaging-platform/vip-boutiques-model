package fr.insalyon.creatis.boutiques.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.annotation.Generated;

import java.util.List;

@Generated("jsonschema2pojo")
public class CustomDirectoryInputsItem {
    @JsonProperty("patterns")
    private List<String> patterns;

    public List<String> getPatterns() { return patterns; }
}
