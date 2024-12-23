package com.se300.ledger.model;

/**
 * General Store Model Exception
 *
 * @author  Sergey L. Sundukovskiy
 * @version 1.0
 * @since   2023-10-11
 */
public class StoreModelException extends Exception {
    private String action;
    private String reason;

    /**
     * Exception Constructor
     *
     * @param action
     * @param reason
     */
    public StoreModelException(String action, String reason) {
        this.action = action;
        this.reason = reason;
    }

    /**
     * Getter method for action
     *
     * @return
     */
    public String getAction() {
        return action;
    }

    /**
     * Setter method for action
     *
     * @param action
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * Setter method for reason
     *
     * @return
     */
    public String getReason() {
        return reason;
    }

    /**
     * Getter method for reason
     *
     * @param reason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }
}
