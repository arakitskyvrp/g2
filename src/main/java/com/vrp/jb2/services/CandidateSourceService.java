package com.vrp.jb2.services;

import java.util.Map;

/**
 * Interface to obtain data about sources.
 */
public interface CandidateSourceService {

    /**
     * Returns a map with the id and the name of the source.
     *
     * @return map with the id and the name of the source.
     */
    public Map<String, String> getSources(); // map with Source.name   and Source.id
}
