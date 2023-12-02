package org.mattei.model;

public class Rule {

    private String ruleId;

    private String description;

    private String logic;

    public Rule() {};

    public Rule(String ruleId, String description, String logic) {
        this.ruleId = ruleId;
        this.description = description;
        this.logic = logic;
    }

    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLogic() {
        return logic;
    }

    public void setLogic(String logic) {
        this.logic = logic;
    }
}
