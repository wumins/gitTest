package com.example.demo.enums;

/*
 * 排序种类
 */
public enum SortType {

    DESC_ID((short)1,(short)1,"id降序"),
    ASC_ID((short)2,(short)1,"id升序"),
    DESC_NAME((short)1,(short)2,"name降序"),
    ASC_NAME((short)2,(short)2,"name升序");

    private short sortType;//排序规则
    private short fieldType;//排序字段
    private String sortName;//排序名称

    private SortType(short sortType, short fieldType, String sortName) {
        this.sortType = sortType;
        this.fieldType = fieldType;
        this.sortName = sortName;
    }

    public short getSortType() {
        return sortType;
    }

    public void setSortType(short sortType) {
        this.sortType = sortType;
    }

    public short getFieldType() {
        return fieldType;
    }

    public void setFieldType(short fieldType) {
        this.fieldType = fieldType;
    }

    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    /**
     * 根据排序规则和排序字段获取排序种类
     * @param sortType
     * @param sortField
     * @return
     */
    public static SortType getSortTypeByIds(Short sortType, Short sortField) {
        SortType[] sortTypes = SortType.values();
        for (SortType type : sortTypes){
            if(sortType != null && type.getSortType() == sortType && type.getFieldType() == sortField){
                return type;
            }
        }
        return null;
    }
}
