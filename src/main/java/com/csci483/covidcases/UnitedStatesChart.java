/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csci483.covidcases;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.primefaces.model.charts.ChartData;
import org.primefaces.model.charts.donut.DonutChartDataSet;
import org.primefaces.model.charts.donut.DonutChartModel;

/**
 *
 * @author bmteasdale
 */
@ManagedBean
@SessionScoped
public class UnitedStatesChart implements Serializable{
    
    private DonutChartModel usDonut;
    
    @PostConstruct
    public void init() {
        createUSDonutModel();
    }
    
    public void createUSDonutModel() {
        this.usDonut = new DonutChartModel();
        ChartData data = new ChartData();

        DonutChartDataSet dataSet = new DonutChartDataSet();
        List<Number> values = new ArrayList<>();
        values.add(7006544);
        values.add(561996);
        values.add(23347816);
        dataSet.setData(values);

        List<String> bgColors = new ArrayList<>();
        bgColors.add("rgb(255, 99, 132)");
        bgColors.add("rgb(54, 162, 235)");
        bgColors.add("rgb(255, 205, 86)");
        dataSet.setBackgroundColor(bgColors);

        data.addChartDataSet(dataSet);
        List<String> labels = new ArrayList<>();
        labels.add("Active Cases (Global)");
        labels.add("Total Deaths (Global)");
        labels.add("Total Recovered (Global)");
        data.setLabels(labels);

        usDonut.setData(data);
    }
    
    public DonutChartModel getUSDonut() {
        return usDonut;
    }

    public void setUSDonut(DonutChartModel donutModel) {
        this.usDonut = donutModel;
    }
}
