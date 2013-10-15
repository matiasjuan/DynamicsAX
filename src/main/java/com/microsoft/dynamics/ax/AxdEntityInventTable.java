
package com.microsoft.dynamics.ax;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AxdEntity_InventTable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AxdEntity_InventTable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="_DocumentHash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ABCContributionMargin" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdEnum_ABC" minOccurs="0"/>
 *         &lt;element name="ABCRevenue" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdEnum_ABC" minOccurs="0"/>
 *         &lt;element name="ABCTieUp" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdEnum_ABC" minOccurs="0"/>
 *         &lt;element name="ABCValue" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdEnum_ABC" minOccurs="0"/>
 *         &lt;element name="AltItemId" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_ItemIdAlternative" minOccurs="0"/>
 *         &lt;element name="AutoReportFinished" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_ItemAutoReportFinished" minOccurs="0"/>
 *         &lt;element name="BatchNumGroupId" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_InventNumGroupId" minOccurs="0"/>
 *         &lt;element name="bhnCompany" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_bhnCustCompanyCode" minOccurs="0"/>
 *         &lt;element name="bhnDivision" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_bhnCustDivisionCode" minOccurs="0"/>
 *         &lt;element name="bhnSubGroup" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_bhnUPCSubGroup" minOccurs="0"/>
 *         &lt;element name="BOMCalcGroupId" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_BOMCalcGroupId" minOccurs="0"/>
 *         &lt;element name="BOMLevel" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_ItemBOMLevel" minOccurs="0"/>
 *         &lt;element name="BOMManualReceipt" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_ItemBOMManualReceipt" minOccurs="0"/>
 *         &lt;element name="BOMUnitId" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_BOMUnitId" minOccurs="0"/>
 *         &lt;element name="CommissionGroupId" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_CommissItemGroup" minOccurs="0"/>
 *         &lt;element name="CostGroupId" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_CostGroupIdDirectMaterial" minOccurs="0"/>
 *         &lt;element name="CostModel" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_ItemCostModel" minOccurs="0"/>
 *         &lt;element name="Density" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_BOMMeasureDensity" minOccurs="0"/>
 *         &lt;element name="Depth" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_BOMMeasureDepth" minOccurs="0"/>
 *         &lt;element name="Dimension" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdArray_AxdExtType_Dimension" minOccurs="0"/>
 *         &lt;element name="DimGroupId" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_InventDimGroupId"/>
 *         &lt;element name="EPCManager" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_EPCManager" minOccurs="0"/>
 *         &lt;element name="grossDepth" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_InventDepth" minOccurs="0"/>
 *         &lt;element name="grossHeight" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_InventHeight" minOccurs="0"/>
 *         &lt;element name="grossWidth" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_InventWidth" minOccurs="0"/>
 *         &lt;element name="Height" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_BOMMeasureHeight" minOccurs="0"/>
 *         &lt;element name="Intracode" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_IntrastatItemCodeId" minOccurs="0"/>
 *         &lt;element name="IntraUnit" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_IntrastatConvert" minOccurs="0"/>
 *         &lt;element name="ItemBuyerGroupId" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_ItemBuyerGroupId" minOccurs="0"/>
 *         &lt;element name="ItemDimCombinationAutoCreate" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_ItemDimCombinationAutoCreate" minOccurs="0"/>
 *         &lt;element name="ItemDimCostPrice" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_ItemDimCostPrice" minOccurs="0"/>
 *         &lt;element name="ItemGroupId" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_ItemGroupId"/>
 *         &lt;element name="ItemId" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_ItemId" minOccurs="0"/>
 *         &lt;element name="ItemIdCompany" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_ItemIdCompany" minOccurs="0"/>
 *         &lt;element name="ItemName" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_ItemName" minOccurs="0"/>
 *         &lt;element name="ItemPriceToleranceGroupId" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_ItemPriceToleranceGroupId" minOccurs="0"/>
 *         &lt;element name="ItemType" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdEnum_ItemType" minOccurs="0"/>
 *         &lt;element name="jsSellEndDate" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_TransDate" minOccurs="0"/>
 *         &lt;element name="jsSellStartDate" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_TransDate" minOccurs="0"/>
 *         &lt;element name="ModelGroupId" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_InventModelGroupId"/>
 *         &lt;element name="NameAlias" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_ItemNameAlias" minOccurs="0"/>
 *         &lt;element name="NetWeight" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_ItemNetWeight" minOccurs="0"/>
 *         &lt;element name="OrigCountryRegionId" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_ItemOrigCountryRegionId" minOccurs="0"/>
 *         &lt;element name="OrigStateId" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_ItemOrigStateId" minOccurs="0"/>
 *         &lt;element name="PackagingGroupId" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_ItemPackagingGroupId" minOccurs="0"/>
 *         &lt;element name="PBAAutoStart" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_PBAAutostart" minOccurs="0"/>
 *         &lt;element name="PBAHideApproval" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_PBAHideApproval" minOccurs="0"/>
 *         &lt;element name="PBAHideDialog" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_PBAHideDialog" minOccurs="0"/>
 *         &lt;element name="PBAInventItemGroupId" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_PBAInventItemGroupId" minOccurs="0"/>
 *         &lt;element name="PBAItemAutoGenerated" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_PBAItemAutoGenerated" minOccurs="0"/>
 *         &lt;element name="PBAItemConfigurable" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdEnum_NoYes" minOccurs="0"/>
 *         &lt;element name="PBAMandatoryConfig" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_PBAMandatoryConfig" minOccurs="0"/>
 *         &lt;element name="Phantom" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_ItemPhantom" minOccurs="0"/>
 *         &lt;element name="PrimaryVendorId" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_ItemPrimaryVendId" minOccurs="0"/>
 *         &lt;element name="ProdFlushingPrincip" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdEnum_ProdFlushingPrincipItem" minOccurs="0"/>
 *         &lt;element name="ProdGroupId" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_ItemProdGroupId" minOccurs="0"/>
 *         &lt;element name="ProdPoolId" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_ItemProdPoolId" minOccurs="0"/>
 *         &lt;element name="projCategoryId" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_ProjCategoryId" minOccurs="0"/>
 *         &lt;element name="PurchModel" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_ItemPurchModel" minOccurs="0"/>
 *         &lt;element name="RecId" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_recId" minOccurs="0"/>
 *         &lt;element name="RecVersion" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_recVersion" minOccurs="0"/>
 *         &lt;element name="ReqGroupId" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_ReqGroupId" minOccurs="0"/>
 *         &lt;element name="SalesContributionRatio" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_ItemSalesContributionRatio" minOccurs="0"/>
 *         &lt;element name="SalesModel" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_ItemSalesModel" minOccurs="0"/>
 *         &lt;element name="SalesPercentMarkup" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_ItemSalesPercentMarkup" minOccurs="0"/>
 *         &lt;element name="SalesPriceModelBasic" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdEnum_SalesPriceModelBasic" minOccurs="0"/>
 *         &lt;element name="ScrapConst" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_ScrapConst" minOccurs="0"/>
 *         &lt;element name="ScrapVar" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_ScrapVar" minOccurs="0"/>
 *         &lt;element name="SerialNumGroupId" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_InventNumGroupId" minOccurs="0"/>
 *         &lt;element name="sortCode" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_WMSSortCode" minOccurs="0"/>
 *         &lt;element name="StatisticsFactor" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_IntrastatMarkupPct" minOccurs="0"/>
 *         &lt;element name="StopExplode" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_ItemStopExplode" minOccurs="0"/>
 *         &lt;element name="TaraWeight" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_ItemTaraWeight" minOccurs="0"/>
 *         &lt;element name="TaxPackagingQty" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_TaxPackagingQty" minOccurs="0"/>
 *         &lt;element name="UnitVolume" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_ItemVolume" minOccurs="0"/>
 *         &lt;element name="UseAltItemId" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_ItemUseAlternative" minOccurs="0"/>
 *         &lt;element name="Width" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_BOMMeasureWidth" minOccurs="0"/>
 *         &lt;element name="WMSArrivalHandlingTime" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_WMSArrivalHandlingTime" minOccurs="0"/>
 *         &lt;element name="Sales" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdEntity_Sales" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Purch" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdEntity_Purch" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Invent" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdEntity_Invent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InventItemLocation" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdEntity_InventItemLocation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InventTxt" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdEntity_InventTxt" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InventTableDocuRef" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdEntity_InventTableDocuRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InventItemSalesSetup" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdEntity_InventItemSalesSetup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InventItemPurchSetup" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdEntity_InventItemPurchSetup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InventItemInventSetup" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdEntity_InventItemInventSetup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="class" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" fixed="entity" />
 *       &lt;attribute name="action" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdEnum_AxdEntityAction" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AxdEntity_InventTable", propOrder = {
    "documentHash",
    "abcContributionMargin",
    "abcRevenue",
    "abcTieUp",
    "abcValue",
    "altItemId",
    "autoReportFinished",
    "batchNumGroupId",
    "bhnCompany",
    "bhnDivision",
    "bhnSubGroup",
    "bomCalcGroupId",
    "bomLevel",
    "bomManualReceipt",
    "bomUnitId",
    "commissionGroupId",
    "costGroupId",
    "costModel",
    "density",
    "depth",
    "dimension",
    "dimGroupId",
    "epcManager",
    "grossDepth",
    "grossHeight",
    "grossWidth",
    "height",
    "intracode",
    "intraUnit",
    "itemBuyerGroupId",
    "itemDimCombinationAutoCreate",
    "itemDimCostPrice",
    "itemGroupId",
    "itemId",
    "itemIdCompany",
    "itemName",
    "itemPriceToleranceGroupId",
    "itemType",
    "jsSellEndDate",
    "jsSellStartDate",
    "modelGroupId",
    "nameAlias",
    "netWeight",
    "origCountryRegionId",
    "origStateId",
    "packagingGroupId",
    "pbaAutoStart",
    "pbaHideApproval",
    "pbaHideDialog",
    "pbaInventItemGroupId",
    "pbaItemAutoGenerated",
    "pbaItemConfigurable",
    "pbaMandatoryConfig",
    "phantom",
    "primaryVendorId",
    "prodFlushingPrincip",
    "prodGroupId",
    "prodPoolId",
    "projCategoryId",
    "purchModel",
    "recId",
    "recVersion",
    "reqGroupId",
    "salesContributionRatio",
    "salesModel",
    "salesPercentMarkup",
    "salesPriceModelBasic",
    "scrapConst",
    "scrapVar",
    "serialNumGroupId",
    "sortCode",
    "statisticsFactor",
    "stopExplode",
    "taraWeight",
    "taxPackagingQty",
    "unitVolume",
    "useAltItemId",
    "width",
    "wmsArrivalHandlingTime",
    "sales",
    "purch",
    "invent",
    "inventItemLocation",
    "inventTxt",
    "inventTableDocuRef",
    "inventItemSalesSetup",
    "inventItemPurchSetup",
    "inventItemInventSetup"
})
public class AxdEntityInventTable {

    @XmlElementRef(name = "_DocumentHash", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<String> documentHash;
    @XmlElementRef(name = "ABCContributionMargin", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<AxdEnumABC> abcContributionMargin;
    @XmlElementRef(name = "ABCRevenue", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<AxdEnumABC> abcRevenue;
    @XmlElementRef(name = "ABCTieUp", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<AxdEnumABC> abcTieUp;
    @XmlElementRef(name = "ABCValue", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<AxdEnumABC> abcValue;
    @XmlElementRef(name = "AltItemId", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<String> altItemId;
    @XmlElementRef(name = "AutoReportFinished", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<AxdExtTypeItemAutoReportFinished> autoReportFinished;
    @XmlElementRef(name = "BatchNumGroupId", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<String> batchNumGroupId;
    @XmlElementRef(name = "bhnCompany", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<String> bhnCompany;
    @XmlElementRef(name = "bhnDivision", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<String> bhnDivision;
    @XmlElementRef(name = "bhnSubGroup", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<String> bhnSubGroup;
    @XmlElementRef(name = "BOMCalcGroupId", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<String> bomCalcGroupId;
    @XmlElementRef(name = "BOMLevel", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<Integer> bomLevel;
    @XmlElementRef(name = "BOMManualReceipt", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<AxdExtTypeItemBOMManualReceipt> bomManualReceipt;
    @XmlElementRef(name = "BOMUnitId", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<String> bomUnitId;
    @XmlElementRef(name = "CommissionGroupId", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<String> commissionGroupId;
    @XmlElementRef(name = "CostGroupId", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<String> costGroupId;
    @XmlElementRef(name = "CostModel", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<AxdExtTypeItemCostModel> costModel;
    @XmlElementRef(name = "Density", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> density;
    @XmlElementRef(name = "Depth", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> depth;
    @XmlElementRef(name = "Dimension", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<AxdArrayAxdExtTypeDimension> dimension;
    @XmlElement(name = "DimGroupId", required = true)
    protected String dimGroupId;
    @XmlElementRef(name = "EPCManager", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> epcManager;
    @XmlElementRef(name = "grossDepth", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> grossDepth;
    @XmlElementRef(name = "grossHeight", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> grossHeight;
    @XmlElementRef(name = "grossWidth", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> grossWidth;
    @XmlElementRef(name = "Height", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> height;
    @XmlElementRef(name = "Intracode", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<String> intracode;
    @XmlElementRef(name = "IntraUnit", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> intraUnit;
    @XmlElementRef(name = "ItemBuyerGroupId", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<String> itemBuyerGroupId;
    @XmlElementRef(name = "ItemDimCombinationAutoCreate", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<AxdExtTypeItemDimCombinationAutoCreate> itemDimCombinationAutoCreate;
    @XmlElementRef(name = "ItemDimCostPrice", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<AxdExtTypeItemDimCostPrice> itemDimCostPrice;
    @XmlElement(name = "ItemGroupId", required = true)
    protected String itemGroupId;
    @XmlElementRef(name = "ItemId", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<String> itemId;
    @XmlElementRef(name = "ItemIdCompany", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<String> itemIdCompany;
    @XmlElementRef(name = "ItemName", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<String> itemName;
    @XmlElementRef(name = "ItemPriceToleranceGroupId", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<String> itemPriceToleranceGroupId;
    @XmlElementRef(name = "ItemType", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<AxdEnumItemType> itemType;
    @XmlElementRef(name = "jsSellEndDate", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> jsSellEndDate;
    @XmlElementRef(name = "jsSellStartDate", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> jsSellStartDate;
    @XmlElement(name = "ModelGroupId", required = true)
    protected String modelGroupId;
    @XmlElementRef(name = "NameAlias", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<String> nameAlias;
    @XmlElementRef(name = "NetWeight", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> netWeight;
    @XmlElementRef(name = "OrigCountryRegionId", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<String> origCountryRegionId;
    @XmlElementRef(name = "OrigStateId", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<String> origStateId;
    @XmlElementRef(name = "PackagingGroupId", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<String> packagingGroupId;
    @XmlElementRef(name = "PBAAutoStart", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<AxdExtTypePBAAutostart> pbaAutoStart;
    @XmlElementRef(name = "PBAHideApproval", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<AxdExtTypePBAHideApproval> pbaHideApproval;
    @XmlElementRef(name = "PBAHideDialog", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<AxdExtTypePBAHideDialog> pbaHideDialog;
    @XmlElementRef(name = "PBAInventItemGroupId", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<String> pbaInventItemGroupId;
    @XmlElementRef(name = "PBAItemAutoGenerated", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<AxdExtTypePBAItemAutoGenerated> pbaItemAutoGenerated;
    @XmlElementRef(name = "PBAItemConfigurable", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<AxdEnumNoYes> pbaItemConfigurable;
    @XmlElementRef(name = "PBAMandatoryConfig", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<AxdExtTypePBAMandatoryConfig> pbaMandatoryConfig;
    @XmlElementRef(name = "Phantom", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<AxdExtTypeItemPhantom> phantom;
    @XmlElementRef(name = "PrimaryVendorId", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<String> primaryVendorId;
    @XmlElementRef(name = "ProdFlushingPrincip", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<AxdEnumProdFlushingPrincipItem> prodFlushingPrincip;
    @XmlElementRef(name = "ProdGroupId", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<String> prodGroupId;
    @XmlElementRef(name = "ProdPoolId", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<String> prodPoolId;
    @XmlElementRef(name = "projCategoryId", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<String> projCategoryId;
    @XmlElementRef(name = "PurchModel", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<AxdExtTypeItemPurchModel> purchModel;
    @XmlElementRef(name = "RecId", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<Long> recId;
    @XmlElementRef(name = "RecVersion", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<Integer> recVersion;
    @XmlElementRef(name = "ReqGroupId", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<String> reqGroupId;
    @XmlElementRef(name = "SalesContributionRatio", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> salesContributionRatio;
    @XmlElementRef(name = "SalesModel", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<AxdExtTypeItemSalesModel> salesModel;
    @XmlElementRef(name = "SalesPercentMarkup", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> salesPercentMarkup;
    @XmlElementRef(name = "SalesPriceModelBasic", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<AxdEnumSalesPriceModelBasic> salesPriceModelBasic;
    @XmlElementRef(name = "ScrapConst", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> scrapConst;
    @XmlElementRef(name = "ScrapVar", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> scrapVar;
    @XmlElementRef(name = "SerialNumGroupId", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<String> serialNumGroupId;
    @XmlElementRef(name = "sortCode", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<Integer> sortCode;
    @XmlElementRef(name = "StatisticsFactor", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> statisticsFactor;
    @XmlElementRef(name = "StopExplode", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<AxdExtTypeItemStopExplode> stopExplode;
    @XmlElementRef(name = "TaraWeight", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> taraWeight;
    @XmlElementRef(name = "TaxPackagingQty", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> taxPackagingQty;
    @XmlElementRef(name = "UnitVolume", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> unitVolume;
    @XmlElementRef(name = "UseAltItemId", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<AxdExtTypeItemUseAlternative> useAltItemId;
    @XmlElementRef(name = "Width", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> width;
    @XmlElementRef(name = "WMSArrivalHandlingTime", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> wmsArrivalHandlingTime;
    @XmlElement(name = "Sales")
    protected List<AxdEntitySales> sales;
    @XmlElement(name = "Purch")
    protected List<AxdEntityPurch> purch;
    @XmlElement(name = "Invent")
    protected List<AxdEntityInvent> invent;
    @XmlElement(name = "InventItemLocation")
    protected List<AxdEntityInventItemLocation> inventItemLocation;
    @XmlElement(name = "InventTxt")
    protected List<AxdEntityInventTxt> inventTxt;
    @XmlElement(name = "InventTableDocuRef")
    protected List<AxdEntityInventTableDocuRef> inventTableDocuRef;
    @XmlElement(name = "InventItemSalesSetup")
    protected List<AxdEntityInventItemSalesSetup> inventItemSalesSetup;
    @XmlElement(name = "InventItemPurchSetup")
    protected List<AxdEntityInventItemPurchSetup> inventItemPurchSetup;
    @XmlElement(name = "InventItemInventSetup")
    protected List<AxdEntityInventItemInventSetup> inventItemInventSetup;
    @XmlAttribute(name = "class", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String clazz;
    @XmlAttribute(name = "action")
    protected AxdEnumAxdEntityAction action;

    /**
     * Gets the value of the documentHash property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocumentHash() {
        return documentHash;
    }

    /**
     * Sets the value of the documentHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocumentHash(JAXBElement<String> value) {
        this.documentHash = value;
    }

    /**
     * Gets the value of the abcContributionMargin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AxdEnumABC }{@code >}
     *     
     */
    public JAXBElement<AxdEnumABC> getABCContributionMargin() {
        return abcContributionMargin;
    }

    /**
     * Sets the value of the abcContributionMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AxdEnumABC }{@code >}
     *     
     */
    public void setABCContributionMargin(JAXBElement<AxdEnumABC> value) {
        this.abcContributionMargin = value;
    }

    /**
     * Gets the value of the abcRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AxdEnumABC }{@code >}
     *     
     */
    public JAXBElement<AxdEnumABC> getABCRevenue() {
        return abcRevenue;
    }

    /**
     * Sets the value of the abcRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AxdEnumABC }{@code >}
     *     
     */
    public void setABCRevenue(JAXBElement<AxdEnumABC> value) {
        this.abcRevenue = value;
    }

    /**
     * Gets the value of the abcTieUp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AxdEnumABC }{@code >}
     *     
     */
    public JAXBElement<AxdEnumABC> getABCTieUp() {
        return abcTieUp;
    }

    /**
     * Sets the value of the abcTieUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AxdEnumABC }{@code >}
     *     
     */
    public void setABCTieUp(JAXBElement<AxdEnumABC> value) {
        this.abcTieUp = value;
    }

    /**
     * Gets the value of the abcValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AxdEnumABC }{@code >}
     *     
     */
    public JAXBElement<AxdEnumABC> getABCValue() {
        return abcValue;
    }

    /**
     * Sets the value of the abcValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AxdEnumABC }{@code >}
     *     
     */
    public void setABCValue(JAXBElement<AxdEnumABC> value) {
        this.abcValue = value;
    }

    /**
     * Gets the value of the altItemId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAltItemId() {
        return altItemId;
    }

    /**
     * Sets the value of the altItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAltItemId(JAXBElement<String> value) {
        this.altItemId = value;
    }

    /**
     * Gets the value of the autoReportFinished property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AxdExtTypeItemAutoReportFinished }{@code >}
     *     
     */
    public JAXBElement<AxdExtTypeItemAutoReportFinished> getAutoReportFinished() {
        return autoReportFinished;
    }

    /**
     * Sets the value of the autoReportFinished property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AxdExtTypeItemAutoReportFinished }{@code >}
     *     
     */
    public void setAutoReportFinished(JAXBElement<AxdExtTypeItemAutoReportFinished> value) {
        this.autoReportFinished = value;
    }

    /**
     * Gets the value of the batchNumGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBatchNumGroupId() {
        return batchNumGroupId;
    }

    /**
     * Sets the value of the batchNumGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBatchNumGroupId(JAXBElement<String> value) {
        this.batchNumGroupId = value;
    }

    /**
     * Gets the value of the bhnCompany property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBhnCompany() {
        return bhnCompany;
    }

    /**
     * Sets the value of the bhnCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBhnCompany(JAXBElement<String> value) {
        this.bhnCompany = value;
    }

    /**
     * Gets the value of the bhnDivision property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBhnDivision() {
        return bhnDivision;
    }

    /**
     * Sets the value of the bhnDivision property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBhnDivision(JAXBElement<String> value) {
        this.bhnDivision = value;
    }

    /**
     * Gets the value of the bhnSubGroup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBhnSubGroup() {
        return bhnSubGroup;
    }

    /**
     * Sets the value of the bhnSubGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBhnSubGroup(JAXBElement<String> value) {
        this.bhnSubGroup = value;
    }

    /**
     * Gets the value of the bomCalcGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBOMCalcGroupId() {
        return bomCalcGroupId;
    }

    /**
     * Sets the value of the bomCalcGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBOMCalcGroupId(JAXBElement<String> value) {
        this.bomCalcGroupId = value;
    }

    /**
     * Gets the value of the bomLevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBOMLevel() {
        return bomLevel;
    }

    /**
     * Sets the value of the bomLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBOMLevel(JAXBElement<Integer> value) {
        this.bomLevel = value;
    }

    /**
     * Gets the value of the bomManualReceipt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AxdExtTypeItemBOMManualReceipt }{@code >}
     *     
     */
    public JAXBElement<AxdExtTypeItemBOMManualReceipt> getBOMManualReceipt() {
        return bomManualReceipt;
    }

    /**
     * Sets the value of the bomManualReceipt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AxdExtTypeItemBOMManualReceipt }{@code >}
     *     
     */
    public void setBOMManualReceipt(JAXBElement<AxdExtTypeItemBOMManualReceipt> value) {
        this.bomManualReceipt = value;
    }

    /**
     * Gets the value of the bomUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBOMUnitId() {
        return bomUnitId;
    }

    /**
     * Sets the value of the bomUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBOMUnitId(JAXBElement<String> value) {
        this.bomUnitId = value;
    }

    /**
     * Gets the value of the commissionGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCommissionGroupId() {
        return commissionGroupId;
    }

    /**
     * Sets the value of the commissionGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCommissionGroupId(JAXBElement<String> value) {
        this.commissionGroupId = value;
    }

    /**
     * Gets the value of the costGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCostGroupId() {
        return costGroupId;
    }

    /**
     * Sets the value of the costGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCostGroupId(JAXBElement<String> value) {
        this.costGroupId = value;
    }

    /**
     * Gets the value of the costModel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AxdExtTypeItemCostModel }{@code >}
     *     
     */
    public JAXBElement<AxdExtTypeItemCostModel> getCostModel() {
        return costModel;
    }

    /**
     * Sets the value of the costModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AxdExtTypeItemCostModel }{@code >}
     *     
     */
    public void setCostModel(JAXBElement<AxdExtTypeItemCostModel> value) {
        this.costModel = value;
    }

    /**
     * Gets the value of the density property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDensity() {
        return density;
    }

    /**
     * Sets the value of the density property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDensity(JAXBElement<BigDecimal> value) {
        this.density = value;
    }

    /**
     * Gets the value of the depth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDepth() {
        return depth;
    }

    /**
     * Sets the value of the depth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDepth(JAXBElement<BigDecimal> value) {
        this.depth = value;
    }

    /**
     * Gets the value of the dimension property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AxdArrayAxdExtTypeDimension }{@code >}
     *     
     */
    public JAXBElement<AxdArrayAxdExtTypeDimension> getDimension() {
        return dimension;
    }

    /**
     * Sets the value of the dimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AxdArrayAxdExtTypeDimension }{@code >}
     *     
     */
    public void setDimension(JAXBElement<AxdArrayAxdExtTypeDimension> value) {
        this.dimension = value;
    }

    /**
     * Gets the value of the dimGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDimGroupId() {
        return dimGroupId;
    }

    /**
     * Sets the value of the dimGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDimGroupId(String value) {
        this.dimGroupId = value;
    }

    /**
     * Gets the value of the epcManager property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getEPCManager() {
        return epcManager;
    }

    /**
     * Sets the value of the epcManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setEPCManager(JAXBElement<BigDecimal> value) {
        this.epcManager = value;
    }

    /**
     * Gets the value of the grossDepth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getGrossDepth() {
        return grossDepth;
    }

    /**
     * Sets the value of the grossDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setGrossDepth(JAXBElement<BigDecimal> value) {
        this.grossDepth = value;
    }

    /**
     * Gets the value of the grossHeight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getGrossHeight() {
        return grossHeight;
    }

    /**
     * Sets the value of the grossHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setGrossHeight(JAXBElement<BigDecimal> value) {
        this.grossHeight = value;
    }

    /**
     * Gets the value of the grossWidth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getGrossWidth() {
        return grossWidth;
    }

    /**
     * Sets the value of the grossWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setGrossWidth(JAXBElement<BigDecimal> value) {
        this.grossWidth = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setHeight(JAXBElement<BigDecimal> value) {
        this.height = value;
    }

    /**
     * Gets the value of the intracode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIntracode() {
        return intracode;
    }

    /**
     * Sets the value of the intracode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIntracode(JAXBElement<String> value) {
        this.intracode = value;
    }

    /**
     * Gets the value of the intraUnit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIntraUnit() {
        return intraUnit;
    }

    /**
     * Sets the value of the intraUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIntraUnit(JAXBElement<BigDecimal> value) {
        this.intraUnit = value;
    }

    /**
     * Gets the value of the itemBuyerGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getItemBuyerGroupId() {
        return itemBuyerGroupId;
    }

    /**
     * Sets the value of the itemBuyerGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setItemBuyerGroupId(JAXBElement<String> value) {
        this.itemBuyerGroupId = value;
    }

    /**
     * Gets the value of the itemDimCombinationAutoCreate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AxdExtTypeItemDimCombinationAutoCreate }{@code >}
     *     
     */
    public JAXBElement<AxdExtTypeItemDimCombinationAutoCreate> getItemDimCombinationAutoCreate() {
        return itemDimCombinationAutoCreate;
    }

    /**
     * Sets the value of the itemDimCombinationAutoCreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AxdExtTypeItemDimCombinationAutoCreate }{@code >}
     *     
     */
    public void setItemDimCombinationAutoCreate(JAXBElement<AxdExtTypeItemDimCombinationAutoCreate> value) {
        this.itemDimCombinationAutoCreate = value;
    }

    /**
     * Gets the value of the itemDimCostPrice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AxdExtTypeItemDimCostPrice }{@code >}
     *     
     */
    public JAXBElement<AxdExtTypeItemDimCostPrice> getItemDimCostPrice() {
        return itemDimCostPrice;
    }

    /**
     * Sets the value of the itemDimCostPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AxdExtTypeItemDimCostPrice }{@code >}
     *     
     */
    public void setItemDimCostPrice(JAXBElement<AxdExtTypeItemDimCostPrice> value) {
        this.itemDimCostPrice = value;
    }

    /**
     * Gets the value of the itemGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemGroupId() {
        return itemGroupId;
    }

    /**
     * Sets the value of the itemGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemGroupId(String value) {
        this.itemGroupId = value;
    }

    /**
     * Gets the value of the itemId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setItemId(JAXBElement<String> value) {
        this.itemId = value;
    }

    /**
     * Gets the value of the itemIdCompany property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getItemIdCompany() {
        return itemIdCompany;
    }

    /**
     * Sets the value of the itemIdCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setItemIdCompany(JAXBElement<String> value) {
        this.itemIdCompany = value;
    }

    /**
     * Gets the value of the itemName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getItemName() {
        return itemName;
    }

    /**
     * Sets the value of the itemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setItemName(JAXBElement<String> value) {
        this.itemName = value;
    }

    /**
     * Gets the value of the itemPriceToleranceGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getItemPriceToleranceGroupId() {
        return itemPriceToleranceGroupId;
    }

    /**
     * Sets the value of the itemPriceToleranceGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setItemPriceToleranceGroupId(JAXBElement<String> value) {
        this.itemPriceToleranceGroupId = value;
    }

    /**
     * Gets the value of the itemType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AxdEnumItemType }{@code >}
     *     
     */
    public JAXBElement<AxdEnumItemType> getItemType() {
        return itemType;
    }

    /**
     * Sets the value of the itemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AxdEnumItemType }{@code >}
     *     
     */
    public void setItemType(JAXBElement<AxdEnumItemType> value) {
        this.itemType = value;
    }

    /**
     * Gets the value of the jsSellEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getJsSellEndDate() {
        return jsSellEndDate;
    }

    /**
     * Sets the value of the jsSellEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setJsSellEndDate(JAXBElement<XMLGregorianCalendar> value) {
        this.jsSellEndDate = value;
    }

    /**
     * Gets the value of the jsSellStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getJsSellStartDate() {
        return jsSellStartDate;
    }

    /**
     * Sets the value of the jsSellStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setJsSellStartDate(JAXBElement<XMLGregorianCalendar> value) {
        this.jsSellStartDate = value;
    }

    /**
     * Gets the value of the modelGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelGroupId() {
        return modelGroupId;
    }

    /**
     * Sets the value of the modelGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelGroupId(String value) {
        this.modelGroupId = value;
    }

    /**
     * Gets the value of the nameAlias property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNameAlias() {
        return nameAlias;
    }

    /**
     * Sets the value of the nameAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNameAlias(JAXBElement<String> value) {
        this.nameAlias = value;
    }

    /**
     * Gets the value of the netWeight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getNetWeight() {
        return netWeight;
    }

    /**
     * Sets the value of the netWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setNetWeight(JAXBElement<BigDecimal> value) {
        this.netWeight = value;
    }

    /**
     * Gets the value of the origCountryRegionId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrigCountryRegionId() {
        return origCountryRegionId;
    }

    /**
     * Sets the value of the origCountryRegionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrigCountryRegionId(JAXBElement<String> value) {
        this.origCountryRegionId = value;
    }

    /**
     * Gets the value of the origStateId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrigStateId() {
        return origStateId;
    }

    /**
     * Sets the value of the origStateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrigStateId(JAXBElement<String> value) {
        this.origStateId = value;
    }

    /**
     * Gets the value of the packagingGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPackagingGroupId() {
        return packagingGroupId;
    }

    /**
     * Sets the value of the packagingGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPackagingGroupId(JAXBElement<String> value) {
        this.packagingGroupId = value;
    }

    /**
     * Gets the value of the pbaAutoStart property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AxdExtTypePBAAutostart }{@code >}
     *     
     */
    public JAXBElement<AxdExtTypePBAAutostart> getPBAAutoStart() {
        return pbaAutoStart;
    }

    /**
     * Sets the value of the pbaAutoStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AxdExtTypePBAAutostart }{@code >}
     *     
     */
    public void setPBAAutoStart(JAXBElement<AxdExtTypePBAAutostart> value) {
        this.pbaAutoStart = value;
    }

    /**
     * Gets the value of the pbaHideApproval property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AxdExtTypePBAHideApproval }{@code >}
     *     
     */
    public JAXBElement<AxdExtTypePBAHideApproval> getPBAHideApproval() {
        return pbaHideApproval;
    }

    /**
     * Sets the value of the pbaHideApproval property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AxdExtTypePBAHideApproval }{@code >}
     *     
     */
    public void setPBAHideApproval(JAXBElement<AxdExtTypePBAHideApproval> value) {
        this.pbaHideApproval = value;
    }

    /**
     * Gets the value of the pbaHideDialog property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AxdExtTypePBAHideDialog }{@code >}
     *     
     */
    public JAXBElement<AxdExtTypePBAHideDialog> getPBAHideDialog() {
        return pbaHideDialog;
    }

    /**
     * Sets the value of the pbaHideDialog property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AxdExtTypePBAHideDialog }{@code >}
     *     
     */
    public void setPBAHideDialog(JAXBElement<AxdExtTypePBAHideDialog> value) {
        this.pbaHideDialog = value;
    }

    /**
     * Gets the value of the pbaInventItemGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPBAInventItemGroupId() {
        return pbaInventItemGroupId;
    }

    /**
     * Sets the value of the pbaInventItemGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPBAInventItemGroupId(JAXBElement<String> value) {
        this.pbaInventItemGroupId = value;
    }

    /**
     * Gets the value of the pbaItemAutoGenerated property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AxdExtTypePBAItemAutoGenerated }{@code >}
     *     
     */
    public JAXBElement<AxdExtTypePBAItemAutoGenerated> getPBAItemAutoGenerated() {
        return pbaItemAutoGenerated;
    }

    /**
     * Sets the value of the pbaItemAutoGenerated property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AxdExtTypePBAItemAutoGenerated }{@code >}
     *     
     */
    public void setPBAItemAutoGenerated(JAXBElement<AxdExtTypePBAItemAutoGenerated> value) {
        this.pbaItemAutoGenerated = value;
    }

    /**
     * Gets the value of the pbaItemConfigurable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AxdEnumNoYes }{@code >}
     *     
     */
    public JAXBElement<AxdEnumNoYes> getPBAItemConfigurable() {
        return pbaItemConfigurable;
    }

    /**
     * Sets the value of the pbaItemConfigurable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AxdEnumNoYes }{@code >}
     *     
     */
    public void setPBAItemConfigurable(JAXBElement<AxdEnumNoYes> value) {
        this.pbaItemConfigurable = value;
    }

    /**
     * Gets the value of the pbaMandatoryConfig property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AxdExtTypePBAMandatoryConfig }{@code >}
     *     
     */
    public JAXBElement<AxdExtTypePBAMandatoryConfig> getPBAMandatoryConfig() {
        return pbaMandatoryConfig;
    }

    /**
     * Sets the value of the pbaMandatoryConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AxdExtTypePBAMandatoryConfig }{@code >}
     *     
     */
    public void setPBAMandatoryConfig(JAXBElement<AxdExtTypePBAMandatoryConfig> value) {
        this.pbaMandatoryConfig = value;
    }

    /**
     * Gets the value of the phantom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AxdExtTypeItemPhantom }{@code >}
     *     
     */
    public JAXBElement<AxdExtTypeItemPhantom> getPhantom() {
        return phantom;
    }

    /**
     * Sets the value of the phantom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AxdExtTypeItemPhantom }{@code >}
     *     
     */
    public void setPhantom(JAXBElement<AxdExtTypeItemPhantom> value) {
        this.phantom = value;
    }

    /**
     * Gets the value of the primaryVendorId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryVendorId() {
        return primaryVendorId;
    }

    /**
     * Sets the value of the primaryVendorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryVendorId(JAXBElement<String> value) {
        this.primaryVendorId = value;
    }

    /**
     * Gets the value of the prodFlushingPrincip property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AxdEnumProdFlushingPrincipItem }{@code >}
     *     
     */
    public JAXBElement<AxdEnumProdFlushingPrincipItem> getProdFlushingPrincip() {
        return prodFlushingPrincip;
    }

    /**
     * Sets the value of the prodFlushingPrincip property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AxdEnumProdFlushingPrincipItem }{@code >}
     *     
     */
    public void setProdFlushingPrincip(JAXBElement<AxdEnumProdFlushingPrincipItem> value) {
        this.prodFlushingPrincip = value;
    }

    /**
     * Gets the value of the prodGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProdGroupId() {
        return prodGroupId;
    }

    /**
     * Sets the value of the prodGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProdGroupId(JAXBElement<String> value) {
        this.prodGroupId = value;
    }

    /**
     * Gets the value of the prodPoolId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProdPoolId() {
        return prodPoolId;
    }

    /**
     * Sets the value of the prodPoolId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProdPoolId(JAXBElement<String> value) {
        this.prodPoolId = value;
    }

    /**
     * Gets the value of the projCategoryId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProjCategoryId() {
        return projCategoryId;
    }

    /**
     * Sets the value of the projCategoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProjCategoryId(JAXBElement<String> value) {
        this.projCategoryId = value;
    }

    /**
     * Gets the value of the purchModel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AxdExtTypeItemPurchModel }{@code >}
     *     
     */
    public JAXBElement<AxdExtTypeItemPurchModel> getPurchModel() {
        return purchModel;
    }

    /**
     * Sets the value of the purchModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AxdExtTypeItemPurchModel }{@code >}
     *     
     */
    public void setPurchModel(JAXBElement<AxdExtTypeItemPurchModel> value) {
        this.purchModel = value;
    }

    /**
     * Gets the value of the recId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRecId() {
        return recId;
    }

    /**
     * Sets the value of the recId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRecId(JAXBElement<Long> value) {
        this.recId = value;
    }

    /**
     * Gets the value of the recVersion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRecVersion() {
        return recVersion;
    }

    /**
     * Sets the value of the recVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRecVersion(JAXBElement<Integer> value) {
        this.recVersion = value;
    }

    /**
     * Gets the value of the reqGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReqGroupId() {
        return reqGroupId;
    }

    /**
     * Sets the value of the reqGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReqGroupId(JAXBElement<String> value) {
        this.reqGroupId = value;
    }

    /**
     * Gets the value of the salesContributionRatio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSalesContributionRatio() {
        return salesContributionRatio;
    }

    /**
     * Sets the value of the salesContributionRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSalesContributionRatio(JAXBElement<BigDecimal> value) {
        this.salesContributionRatio = value;
    }

    /**
     * Gets the value of the salesModel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AxdExtTypeItemSalesModel }{@code >}
     *     
     */
    public JAXBElement<AxdExtTypeItemSalesModel> getSalesModel() {
        return salesModel;
    }

    /**
     * Sets the value of the salesModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AxdExtTypeItemSalesModel }{@code >}
     *     
     */
    public void setSalesModel(JAXBElement<AxdExtTypeItemSalesModel> value) {
        this.salesModel = value;
    }

    /**
     * Gets the value of the salesPercentMarkup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSalesPercentMarkup() {
        return salesPercentMarkup;
    }

    /**
     * Sets the value of the salesPercentMarkup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSalesPercentMarkup(JAXBElement<BigDecimal> value) {
        this.salesPercentMarkup = value;
    }

    /**
     * Gets the value of the salesPriceModelBasic property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AxdEnumSalesPriceModelBasic }{@code >}
     *     
     */
    public JAXBElement<AxdEnumSalesPriceModelBasic> getSalesPriceModelBasic() {
        return salesPriceModelBasic;
    }

    /**
     * Sets the value of the salesPriceModelBasic property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AxdEnumSalesPriceModelBasic }{@code >}
     *     
     */
    public void setSalesPriceModelBasic(JAXBElement<AxdEnumSalesPriceModelBasic> value) {
        this.salesPriceModelBasic = value;
    }

    /**
     * Gets the value of the scrapConst property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getScrapConst() {
        return scrapConst;
    }

    /**
     * Sets the value of the scrapConst property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setScrapConst(JAXBElement<BigDecimal> value) {
        this.scrapConst = value;
    }

    /**
     * Gets the value of the scrapVar property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getScrapVar() {
        return scrapVar;
    }

    /**
     * Sets the value of the scrapVar property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setScrapVar(JAXBElement<BigDecimal> value) {
        this.scrapVar = value;
    }

    /**
     * Gets the value of the serialNumGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSerialNumGroupId() {
        return serialNumGroupId;
    }

    /**
     * Sets the value of the serialNumGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSerialNumGroupId(JAXBElement<String> value) {
        this.serialNumGroupId = value;
    }

    /**
     * Gets the value of the sortCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSortCode() {
        return sortCode;
    }

    /**
     * Sets the value of the sortCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSortCode(JAXBElement<Integer> value) {
        this.sortCode = value;
    }

    /**
     * Gets the value of the statisticsFactor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getStatisticsFactor() {
        return statisticsFactor;
    }

    /**
     * Sets the value of the statisticsFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setStatisticsFactor(JAXBElement<BigDecimal> value) {
        this.statisticsFactor = value;
    }

    /**
     * Gets the value of the stopExplode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AxdExtTypeItemStopExplode }{@code >}
     *     
     */
    public JAXBElement<AxdExtTypeItemStopExplode> getStopExplode() {
        return stopExplode;
    }

    /**
     * Sets the value of the stopExplode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AxdExtTypeItemStopExplode }{@code >}
     *     
     */
    public void setStopExplode(JAXBElement<AxdExtTypeItemStopExplode> value) {
        this.stopExplode = value;
    }

    /**
     * Gets the value of the taraWeight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTaraWeight() {
        return taraWeight;
    }

    /**
     * Sets the value of the taraWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTaraWeight(JAXBElement<BigDecimal> value) {
        this.taraWeight = value;
    }

    /**
     * Gets the value of the taxPackagingQty property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTaxPackagingQty() {
        return taxPackagingQty;
    }

    /**
     * Sets the value of the taxPackagingQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTaxPackagingQty(JAXBElement<BigDecimal> value) {
        this.taxPackagingQty = value;
    }

    /**
     * Gets the value of the unitVolume property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getUnitVolume() {
        return unitVolume;
    }

    /**
     * Sets the value of the unitVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setUnitVolume(JAXBElement<BigDecimal> value) {
        this.unitVolume = value;
    }

    /**
     * Gets the value of the useAltItemId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AxdExtTypeItemUseAlternative }{@code >}
     *     
     */
    public JAXBElement<AxdExtTypeItemUseAlternative> getUseAltItemId() {
        return useAltItemId;
    }

    /**
     * Sets the value of the useAltItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AxdExtTypeItemUseAlternative }{@code >}
     *     
     */
    public void setUseAltItemId(JAXBElement<AxdExtTypeItemUseAlternative> value) {
        this.useAltItemId = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setWidth(JAXBElement<BigDecimal> value) {
        this.width = value;
    }

    /**
     * Gets the value of the wmsArrivalHandlingTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getWMSArrivalHandlingTime() {
        return wmsArrivalHandlingTime;
    }

    /**
     * Sets the value of the wmsArrivalHandlingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setWMSArrivalHandlingTime(JAXBElement<XMLGregorianCalendar> value) {
        this.wmsArrivalHandlingTime = value;
    }

    /**
     * Gets the value of the sales property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sales property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSales().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AxdEntitySales }
     * 
     * 
     */
    public List<AxdEntitySales> getSales() {
        if (sales == null) {
            sales = new ArrayList<AxdEntitySales>();
        }
        return this.sales;
    }

    /**
     * Gets the value of the purch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AxdEntityPurch }
     * 
     * 
     */
    public List<AxdEntityPurch> getPurch() {
        if (purch == null) {
            purch = new ArrayList<AxdEntityPurch>();
        }
        return this.purch;
    }

    /**
     * Gets the value of the invent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AxdEntityInvent }
     * 
     * 
     */
    public List<AxdEntityInvent> getInvent() {
        if (invent == null) {
            invent = new ArrayList<AxdEntityInvent>();
        }
        return this.invent;
    }

    /**
     * Gets the value of the inventItemLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inventItemLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInventItemLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AxdEntityInventItemLocation }
     * 
     * 
     */
    public List<AxdEntityInventItemLocation> getInventItemLocation() {
        if (inventItemLocation == null) {
            inventItemLocation = new ArrayList<AxdEntityInventItemLocation>();
        }
        return this.inventItemLocation;
    }

    /**
     * Gets the value of the inventTxt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inventTxt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInventTxt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AxdEntityInventTxt }
     * 
     * 
     */
    public List<AxdEntityInventTxt> getInventTxt() {
        if (inventTxt == null) {
            inventTxt = new ArrayList<AxdEntityInventTxt>();
        }
        return this.inventTxt;
    }

    /**
     * Gets the value of the inventTableDocuRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inventTableDocuRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInventTableDocuRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AxdEntityInventTableDocuRef }
     * 
     * 
     */
    public List<AxdEntityInventTableDocuRef> getInventTableDocuRef() {
        if (inventTableDocuRef == null) {
            inventTableDocuRef = new ArrayList<AxdEntityInventTableDocuRef>();
        }
        return this.inventTableDocuRef;
    }

    /**
     * Gets the value of the inventItemSalesSetup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inventItemSalesSetup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInventItemSalesSetup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AxdEntityInventItemSalesSetup }
     * 
     * 
     */
    public List<AxdEntityInventItemSalesSetup> getInventItemSalesSetup() {
        if (inventItemSalesSetup == null) {
            inventItemSalesSetup = new ArrayList<AxdEntityInventItemSalesSetup>();
        }
        return this.inventItemSalesSetup;
    }

    /**
     * Gets the value of the inventItemPurchSetup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inventItemPurchSetup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInventItemPurchSetup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AxdEntityInventItemPurchSetup }
     * 
     * 
     */
    public List<AxdEntityInventItemPurchSetup> getInventItemPurchSetup() {
        if (inventItemPurchSetup == null) {
            inventItemPurchSetup = new ArrayList<AxdEntityInventItemPurchSetup>();
        }
        return this.inventItemPurchSetup;
    }

    /**
     * Gets the value of the inventItemInventSetup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inventItemInventSetup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInventItemInventSetup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AxdEntityInventItemInventSetup }
     * 
     * 
     */
    public List<AxdEntityInventItemInventSetup> getInventItemInventSetup() {
        if (inventItemInventSetup == null) {
            inventItemInventSetup = new ArrayList<AxdEntityInventItemInventSetup>();
        }
        return this.inventItemInventSetup;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        if (clazz == null) {
            return "entity";
        } else {
            return clazz;
        }
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link AxdEnumAxdEntityAction }
     *     
     */
    public AxdEnumAxdEntityAction getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link AxdEnumAxdEntityAction }
     *     
     */
    public void setAction(AxdEnumAxdEntityAction value) {
        this.action = value;
    }

}
