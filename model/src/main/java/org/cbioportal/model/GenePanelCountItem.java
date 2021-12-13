package org.cbioportal.model;

import java.io.Serializable;
import java.util.List;

/**
 * Counts of various gene panels for a molecular profile. This model is designed
 * to match ClinicalDataCountItem, with more logical names for the context
 */
public class GenePanelCountItem implements Serializable {
    private String molecularProfileId;
    private List<ClinicalDataCount> counts;

    public String getMolecularProfileId() {
        return molecularProfileId;
    }

    public void setMolecularProfileId(String molecularProfileId) {
        this.molecularProfileId = molecularProfileId;
    }

    public List<ClinicalDataCount> getCounts() {
        return counts;
    }

    public void setCounts(List<ClinicalDataCount> counts) {
        this.counts = counts;
    }
}
