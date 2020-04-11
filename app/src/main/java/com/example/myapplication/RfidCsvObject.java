package com.example.myapplication;

import com.univocity.parsers.annotations.Parsed;

import java.util.Date;

public class RfidCsvObject {
    @Parsed
    private String serial;
    @Parsed
    private Date dateAndTime;
    @Parsed
    private double pmax;
    @Parsed
    private double voc;
    @Parsed
    private double isc;
    @Parsed
    private double vmp;
    @Parsed
    private double imp;
    @Parsed
    private double ff;
    @Parsed
    private double rs;
    @Parsed
    private double rsh;
    @Parsed
    private String classLabel;
    @Parsed
    private String classDesc;
    @Parsed
    private double modEff;
    @Parsed
    private String cellMake;
    @Parsed
    private String cellType;

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public Date getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(Date dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public double getPmax() {
        return pmax;
    }

    public void setPmax(double pmax) {
        this.pmax = pmax;
    }

    public double getVoc() {
        return voc;
    }

    public void setVoc(double voc) {
        this.voc = voc;
    }

    public double getIsc() {
        return isc;
    }

    public void setIsc(double isc) {
        this.isc = isc;
    }

    public double getVmp() {
        return vmp;
    }

    public void setVmp(double vmp) {
        this.vmp = vmp;
    }

    public double getImp() {
        return imp;
    }

    public void setImp(double imp) {
        this.imp = imp;
    }

    public double getFf() {
        return ff;
    }

    public void setFf(double ff) {
        this.ff = ff;
    }

    public double getRs() {
        return rs;
    }

    public void setRs(double rs) {
        this.rs = rs;
    }

    public double getRsh() {
        return rsh;
    }

    public void setRsh(double rsh) {
        this.rsh = rsh;
    }

    public String getClassLabel() {
        return classLabel;
    }

    public void setClassLabel(String classLabel) {
        this.classLabel = classLabel;
    }

    public String getClassDesc() {
        return classDesc;
    }

    public void setClassDesc(String classDesc) {
        this.classDesc = classDesc;
    }

    public double getModEff() {
        return modEff;
    }

    public void setModEff(double modEff) {
        this.modEff = modEff;
    }

    public String getCellMake() {
        return cellMake;
    }

    public void setCellMake(String cellMake) {
        this.cellMake = cellMake;
    }

    public String getCellType() {
        return cellType;
    }

    public void setCellType(String cellType) {
        this.cellType = cellType;
    }

    @Override
    public String toString() {
        return "RfidCsvObject{" +
                "serial='" + serial + '\'' +
                ", dateAndTime=" + dateAndTime +
                ", pmax=" + pmax +
                ", voc=" + voc +
                ", isc=" + isc +
                ", vmp=" + vmp +
                ", imp=" + imp +
                ", ff=" + ff +
                ", rs=" + rs +
                ", rsh=" + rsh +
                ", classLabel='" + classLabel + '\'' +
                ", classDesc='" + classDesc + '\'' +
                ", modEff=" + modEff +
                ", cellMake='" + cellMake + '\'' +
                ", cellType='" + cellType + '\'' +
                '}';
    }
}
