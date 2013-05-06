package com.sforce.soap.services;

import java.util.Map;

/**
 * Interface to obtain data about sources.
 */
public interface CandidateSourceService {
    public Map<String, String> getSources(); // map with Source.name   and Source.id
}
