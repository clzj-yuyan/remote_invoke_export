package com.yuyan.pojo;

import com.alibaba.excel.annotation.ExcelProperty;

public class FoodCountInfoDO {

    @ExcelProperty("序号")
    private String key;
    @ExcelProperty("菜品分类")
    private String foodCategoryName;
    @ExcelProperty("菜品编码")
    private String foodCode;
    @ExcelProperty("菜品名称")
    private String foodName;
    @ExcelProperty("菜品收入科目")
    private String foodSubjectName;
    @ExcelProperty("规格")
    private String foodUnit;
    @ExcelProperty("流水数量")
    private String foodNumber;
    @ExcelProperty("流水数量%")
    private String saleNumRate;
    @ExcelProperty("原价销售金额")
    private String foodProPriceAmount;
    @ExcelProperty("辅助数量")
    private String unitAdjutantNumber;
    @ExcelProperty("流水金额")
    private String foodAmount;
    @ExcelProperty("流水金额%")
    private String foodAmountRate;
    @ExcelProperty("平均售价")
    private String avgFoodAmount;
    @ExcelProperty("实收数量")
    private String foodRealNum;
    @ExcelProperty("实收数量%")
    private String foodRealNumRate;
    @ExcelProperty("实收金额")
    private String paidAmount;
    @ExcelProperty("实收金额%")
    private String paidAmountRate;
    @ExcelProperty("平均实收")
    private String avgPaidAmount;
    @ExcelProperty("菜品销售账单数")
    private String foodOrderCount;
    @ExcelProperty("优惠金额")
    private String promotionAmount;
    @ExcelProperty("改价优惠金额")
    private String changePricePromotionAmount;
    @ExcelProperty("优惠总额")
    private String totalPromotionAmount;
    @ExcelProperty("店铺总账单数")
    private String orderCount;
    @ExcelProperty("菜品销售千次")
    private String salePerThousand;
    @ExcelProperty("菜品点击率")
    private String foodSaleRate;
    @ExcelProperty("顾客点击率")
    private String cor;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getFoodCategoryName() {
        return foodCategoryName;
    }

    public void setFoodCategoryName(String foodCategoryName) {
        this.foodCategoryName = foodCategoryName;
    }

    public String getFoodCode() {
        return foodCode;
    }

    public void setFoodCode(String foodCode) {
        this.foodCode = foodCode;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodSubjectName() {
        return foodSubjectName;
    }

    public void setFoodSubjectName(String foodSubjectName) {
        this.foodSubjectName = foodSubjectName;
    }

    public String getFoodUnit() {
        return foodUnit;
    }

    public void setFoodUnit(String foodUnit) {
        this.foodUnit = foodUnit;
    }

    public String getFoodNumber() {
        return foodNumber;
    }

    public void setFoodNumber(String foodNumber) {
        this.foodNumber = foodNumber;
    }

    public String getSaleNumRate() {
        return saleNumRate;
    }

    public void setSaleNumRate(String saleNumRate) {
        this.saleNumRate = saleNumRate;
    }

    public String getFoodProPriceAmount() {
        return foodProPriceAmount;
    }

    public void setFoodProPriceAmount(String foodProPriceAmount) {
        this.foodProPriceAmount = foodProPriceAmount;
    }

    public String getUnitAdjutantNumber() {
        return unitAdjutantNumber;
    }

    public void setUnitAdjutantNumber(String unitAdjutantNumber) {
        this.unitAdjutantNumber = unitAdjutantNumber;
    }

    public String getFoodAmount() {
        return foodAmount;
    }

    public void setFoodAmount(String foodAmount) {
        this.foodAmount = foodAmount;
    }

    public String getFoodAmountRate() {
        return foodAmountRate;
    }

    public void setFoodAmountRate(String foodAmountRate) {
        this.foodAmountRate = foodAmountRate;
    }

    public String getAvgFoodAmount() {
        return avgFoodAmount;
    }

    public void setAvgFoodAmount(String avgFoodAmount) {
        this.avgFoodAmount = avgFoodAmount;
    }

    public String getFoodRealNum() {
        return foodRealNum;
    }

    public void setFoodRealNum(String foodRealNum) {
        this.foodRealNum = foodRealNum;
    }

    public String getFoodRealNumRate() {
        return foodRealNumRate;
    }

    public void setFoodRealNumRate(String foodRealNumRate) {
        this.foodRealNumRate = foodRealNumRate;
    }

    public String getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(String paidAmount) {
        this.paidAmount = paidAmount;
    }

    public String getPaidAmountRate() {
        return paidAmountRate;
    }

    public void setPaidAmountRate(String paidAmountRate) {
        this.paidAmountRate = paidAmountRate;
    }

    public String getAvgPaidAmount() {
        return avgPaidAmount;
    }

    public void setAvgPaidAmount(String avgPaidAmount) {
        this.avgPaidAmount = avgPaidAmount;
    }

    public String getFoodOrderCount() {
        return foodOrderCount;
    }

    public void setFoodOrderCount(String foodOrderCount) {
        this.foodOrderCount = foodOrderCount;
    }

    public String getPromotionAmount() {
        return promotionAmount;
    }

    public void setPromotionAmount(String promotionAmount) {
        this.promotionAmount = promotionAmount;
    }

    public String getChangePricePromotionAmount() {
        return changePricePromotionAmount;
    }

    public void setChangePricePromotionAmount(String changePricePromotionAmount) {
        this.changePricePromotionAmount = changePricePromotionAmount;
    }

    public String getTotalPromotionAmount() {
        return totalPromotionAmount;
    }

    public void setTotalPromotionAmount(String totalPromotionAmount) {
        this.totalPromotionAmount = totalPromotionAmount;
    }

    public String getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(String orderCount) {
        this.orderCount = orderCount;
    }

    public String getSalePerThousand() {
        return salePerThousand;
    }

    public void setSalePerThousand(String salePerThousand) {
        this.salePerThousand = salePerThousand;
    }

    public String getFoodSaleRate() {
        return foodSaleRate;
    }

    public void setFoodSaleRate(String foodSaleRate) {
        this.foodSaleRate = foodSaleRate;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
