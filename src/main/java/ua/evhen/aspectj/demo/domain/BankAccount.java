package ua.evhen.aspectj.demo.domain;

import java.util.Objects;

public class BankAccount {

    private String pan;
    private String panSate;
    private String exDate;
    private String panName;
    private long clientId;

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getPanSate() {
        return panSate;
    }

    public void setPanSate(String panSate) {
        this.panSate = panSate;
    }

    public String getExDate() {
        return exDate;
    }

    public void setExDate(String exDate) {
        this.exDate = exDate;
    }

    public String getPanName() {
        return panName;
    }

    public void setPanName(String panName) {
        this.panName = panName;
    }

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }


    @Override
    public int hashCode() {
        return Objects.hashCode(this.pan);
    }

    @Override
    public boolean equals(Object obj) {
        return obj == this || (obj instanceof BankAccount && Objects.equals(this.pan, BankAccount.class.cast(obj).pan));
    }


    @Override
    public String toString() {
        return "BankAccount{" +
                "pan='" + pan + '\'' +
                ", panSate='" + panSate + '\'' +
                ", exDate='" + exDate + '\'' +
                ", panName='" + panName + '\'' +
                ", clientId=" + clientId +
                '}';
    }
}
