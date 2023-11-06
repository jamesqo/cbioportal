package org.cbioportal.model;

import org.apache.commons.lang3.tuple.ImmutablePair;

public class ClinicalDataTableResult {
    
    private final ImmutablePair<SampleClinicalDataCollection, Integer> pair;
    
    public ClinicalDataTableResult(SampleClinicalDataCollection pagedCollectionFragment, Integer totalCount) {
        this.pair = new ImmutablePair<>(pagedCollectionFragment, totalCount);
    }

    public ClinicalDataTableResult() {
        this.pair =  new ImmutablePair<>(new SampleClinicalDataCollection(), 0);
    }
    
    public SampleClinicalDataCollection getSampleClinicalDataCollection() {
        return pair.getLeft();
    }
    public Integer getTotalCount() {
        return pair.getRight();
    }
    
}
