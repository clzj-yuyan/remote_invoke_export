package com.yuyan.pojo;

import java.util.List;

public class DataInfoDO {

    private String columns;
    private String page;
    private List<FoodCountInfoDO> dataSource;
    private FoodCountInfoDO sum;
    private String rowPager;
    private String totalSize;
    private String rowPage;
    private String description;

    public String getColumns() {
        return columns;
    }

    public void setColumns(String columns) {
        this.columns = columns;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public List<FoodCountInfoDO> getDataSource() {
        return dataSource;
    }

    public void setDataSource(List<FoodCountInfoDO> dataSource) {
        this.dataSource = dataSource;
    }

    public FoodCountInfoDO getSum() {
        return sum;
    }

    public void setSum(FoodCountInfoDO sum) {
        this.sum = sum;
    }

    public String getRowPager() {
        return rowPager;
    }

    public void setRowPager(String rowPager) {
        this.rowPager = rowPager;
    }

    public String getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(String totalSize) {
        this.totalSize = totalSize;
    }

    public String getRowPage() {
        return rowPage;
    }

    public void setRowPage(String rowPage) {
        this.rowPage = rowPage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
