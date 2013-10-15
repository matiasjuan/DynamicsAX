
package com.microsoft.dynamics.ax;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.microsoft.dynamics.ax package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _Item_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "Item");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _QueryCriteria_QNAME = new QName("http://schemas.microsoft.com/dynamics/2006/02/documents/QueryCriteria", "QueryCriteria");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _FaultMessageList_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Fault", "FaultMessageList");
    private final static QName _EntityKeyList_QNAME = new QName("http://schemas.microsoft.com/dynamics/2006/02/documents/EntityKeyList", "EntityKeyList");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _AifFault_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Fault", "AifFault");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _FaultMessage_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Fault", "FaultMessage");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _ArrayOfFaultMessage_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Fault", "ArrayOfFaultMessage");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _ArrayOfFaultMessageList_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Fault", "ArrayOfFaultMessageList");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _EntityKey_QNAME = new QName("http://schemas.microsoft.com/dynamics/2006/02/documents/EntityKey", "EntityKey");
    private final static QName _AxdEntityInventItemLocationRecVersion_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "RecVersion");
    private final static QName _AxdEntityInventItemLocationWMSLocationIdDefaultReceipt_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "WMSLocationIdDefaultReceipt");
    private final static QName _AxdEntityInventItemLocationInventDimId_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "inventDimId");
    private final static QName _AxdEntityInventItemLocationCountGroupId_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "CountGroupId");
    private final static QName _AxdEntityInventItemLocationCountingJournalId_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "CountingJournalId");
    private final static QName _AxdEntityInventItemLocationCountingStarted_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "CountingStarted");
    private final static QName _AxdEntityInventItemLocationWMSPickingLocation_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "wMSPickingLocation");
    private final static QName _AxdEntityInventItemLocationWMSLocationIdDefaultIssue_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "WMSLocationIdDefaultIssue");
    private final static QName _AxdEntityInventItemLocationRecId_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "RecId");
    private final static QName _AxdEntitySalesEndDisc_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "EndDisc");
    private final static QName _AxdEntitySalesPcsPrice_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "PcsPrice");
    private final static QName _AxdEntitySalesPrice_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "Price");
    private final static QName _AxdEntitySalesAllocateMarkup_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "AllocateMarkup");
    private final static QName _AxdEntitySalesLineDisc_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "LineDisc");
    private final static QName _AxdEntitySalesSuppItemGroupId_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "SuppItemGroupId");
    private final static QName _AxdEntitySalesUnitId_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "UnitId");
    private final static QName _AxdEntitySalesTaxItemGroupId_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "TaxItemGroupId");
    private final static QName _AxdEntitySalesUnderDeliveryPct_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "UnderDeliveryPct");
    private final static QName _AxdEntitySalesOverDeliveryPct_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "OverDeliveryPct");
    private final static QName _AxdEntitySalesPriceDate_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "PriceDate");
    private final static QName _AxdEntitySalesMarkup_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "Markup");
    private final static QName _AxdEntitySalesModuleType_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "ModuleType");
    private final static QName _AxdEntitySalesPriceQty_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "PriceQty");
    private final static QName _AxdEntitySalesInterCompanyBlocked_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "InterCompanyBlocked");
    private final static QName _AxdEntitySalesMarkupGroupId_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "MarkupGroupId");
    private final static QName _AxdEntitySalesPriceUnit_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "PriceUnit");
    private final static QName _AxdEntitySalesMultiLineDisc_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "MultiLineDisc");
    private final static QName _FaultMessageListServiceOperationParameter_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Fault", "ServiceOperationParameter");
    private final static QName _FaultMessageListFaultMessageArray_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Fault", "FaultMessageArray");
    private final static QName _FaultMessageListXPath_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Fault", "XPath");
    private final static QName _FaultMessageListField_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Fault", "Field");
    private final static QName _FaultMessageListService_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Fault", "Service");
    private final static QName _FaultMessageListDocument_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Fault", "Document");
    private final static QName _FaultMessageListXmlPosition_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Fault", "XmlPosition");
    private final static QName _FaultMessageListXmlLine_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Fault", "XmlLine");
    private final static QName _FaultMessageListServiceOperation_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Fault", "ServiceOperation");
    private final static QName _FaultMessageListDocumentOperation_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Fault", "DocumentOperation");
    private final static QName _AxdEntityInventDimSalesSetupInventSiteId_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "InventSiteId");
    private final static QName _AxdEntityInventDimSalesSetupWMSLocationId_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "wMSLocationId");
    private final static QName _AxdEntityInventDimSalesSetupInventSerialId_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "inventSerialId");
    private final static QName _AxdEntityInventDimSalesSetupInventBatchId_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "InventBatchId");
    private final static QName _AxdEntityInventDimSalesSetupInventLocationId_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "InventLocationId");
    private final static QName _AxdEntityInventItemSalesSetupStopped_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "Stopped");
    private final static QName _AxdEntityInventItemSalesSetupHighestQty_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "HighestQty");
    private final static QName _AxdEntityInventItemSalesSetupDeliveryDateControlType_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "DeliveryDateControlType");
    private final static QName _AxdEntityInventItemSalesSetupInventDimId_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "InventDimId");
    private final static QName _AxdEntityInventItemSalesSetupOverride_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "Override");
    private final static QName _AxdEntityInventItemSalesSetupMultipleQty_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "MultipleQty");
    private final static QName _AxdEntityInventItemSalesSetupATPTimeFence_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "ATPTimeFence");
    private final static QName _AxdEntityInventItemSalesSetupStandardQty_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "StandardQty");
    private final static QName _AxdEntityInventItemSalesSetupLeadTime_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "LeadTime");
    private final static QName _AxdEntityInventItemSalesSetupATPInclPlannedOrders_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "ATPInclPlannedOrders");
    private final static QName _AxdEntityInventItemSalesSetupMandatoryInventSite_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "MandatoryInventSite");
    private final static QName _AxdEntityInventItemSalesSetupMandatoryInventLocation_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "MandatoryInventLocation");
    private final static QName _AxdEntityInventItemSalesSetupInventDimIdDefault_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "InventDimIdDefault");
    private final static QName _AxdEntityInventItemSalesSetupLowestQty_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "LowestQty");
    private final static QName _AxdEntityInventItemPurchSetupCalendarDays_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "CalendarDays");
    private final static QName _AxdEntityInventTableABCContributionMargin_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "ABCContributionMargin");
    private final static QName _AxdEntityInventTableItemDimCombinationAutoCreate_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "ItemDimCombinationAutoCreate");
    private final static QName _AxdEntityInventTableItemName_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "ItemName");
    private final static QName _AxdEntityInventTableItemType_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "ItemType");
    private final static QName _AxdEntityInventTableReqGroupId_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "ReqGroupId");
    private final static QName _AxdEntityInventTableWMSArrivalHandlingTime_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "WMSArrivalHandlingTime");
    private final static QName _AxdEntityInventTableSalesModel_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "SalesModel");
    private final static QName _AxdEntityInventTableGrossHeight_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "grossHeight");
    private final static QName _AxdEntityInventTableBOMCalcGroupId_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "BOMCalcGroupId");
    private final static QName _AxdEntityInventTableItemDimCostPrice_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "ItemDimCostPrice");
    private final static QName _AxdEntityInventTableJsSellStartDate_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "jsSellStartDate");
    private final static QName _AxdEntityInventTableProdPoolId_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "ProdPoolId");
    private final static QName _AxdEntityInventTableBhnDivision_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "bhnDivision");
    private final static QName _AxdEntityInventTableNameAlias_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "NameAlias");
    private final static QName _AxdEntityInventTableProdGroupId_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "ProdGroupId");
    private final static QName _AxdEntityInventTablePBAAutoStart_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "PBAAutoStart");
    private final static QName _AxdEntityInventTableSortCode_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "sortCode");
    private final static QName _AxdEntityInventTablePBAMandatoryConfig_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "PBAMandatoryConfig");
    private final static QName _AxdEntityInventTableABCRevenue_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "ABCRevenue");
    private final static QName _AxdEntityInventTableBatchNumGroupId_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "BatchNumGroupId");
    private final static QName _AxdEntityInventTableOrigCountryRegionId_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "OrigCountryRegionId");
    private final static QName _AxdEntityInventTableJsSellEndDate_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "jsSellEndDate");
    private final static QName _AxdEntityInventTableDepth_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "Depth");
    private final static QName _AxdEntityInventTableABCValue_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "ABCValue");
    private final static QName _AxdEntityInventTablePrimaryVendorId_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "PrimaryVendorId");
    private final static QName _AxdEntityInventTableEPCManager_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "EPCManager");
    private final static QName _AxdEntityInventTablePhantom_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "Phantom");
    private final static QName _AxdEntityInventTableNetWeight_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "NetWeight");
    private final static QName _AxdEntityInventTablePBAHideDialog_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "PBAHideDialog");
    private final static QName _AxdEntityInventTableGrossDepth_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "grossDepth");
    private final static QName _AxdEntityInventTableUseAltItemId_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "UseAltItemId");
    private final static QName _AxdEntityInventTableSalesContributionRatio_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "SalesContributionRatio");
    private final static QName _AxdEntityInventTablePBAInventItemGroupId_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "PBAInventItemGroupId");
    private final static QName _AxdEntityInventTableDocumentHash_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "_DocumentHash");
    private final static QName _AxdEntityInventTableUnitVolume_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "UnitVolume");
    private final static QName _AxdEntityInventTableSerialNumGroupId_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "SerialNumGroupId");
    private final static QName _AxdEntityInventTableItemId_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "ItemId");
    private final static QName _AxdEntityInventTableSalesPriceModelBasic_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "SalesPriceModelBasic");
    private final static QName _AxdEntityInventTableDensity_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "Density");
    private final static QName _AxdEntityInventTableDimension_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "Dimension");
    private final static QName _AxdEntityInventTableIntracode_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "Intracode");
    private final static QName _AxdEntityInventTableIntraUnit_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "IntraUnit");
    private final static QName _AxdEntityInventTableStatisticsFactor_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "StatisticsFactor");
    private final static QName _AxdEntityInventTableAltItemId_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "AltItemId");
    private final static QName _AxdEntityInventTablePBAItemAutoGenerated_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "PBAItemAutoGenerated");
    private final static QName _AxdEntityInventTableWidth_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "Width");
    private final static QName _AxdEntityInventTableItemIdCompany_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "ItemIdCompany");
    private final static QName _AxdEntityInventTableOrigStateId_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "OrigStateId");
    private final static QName _AxdEntityInventTableCostModel_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "CostModel");
    private final static QName _AxdEntityInventTableProdFlushingPrincip_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "ProdFlushingPrincip");
    private final static QName _AxdEntityInventTablePurchModel_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "PurchModel");
    private final static QName _AxdEntityInventTableBOMLevel_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "BOMLevel");
    private final static QName _AxdEntityInventTableScrapConst_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "ScrapConst");
    private final static QName _AxdEntityInventTableAutoReportFinished_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "AutoReportFinished");
    private final static QName _AxdEntityInventTablePBAItemConfigurable_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "PBAItemConfigurable");
    private final static QName _AxdEntityInventTableCommissionGroupId_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "CommissionGroupId");
    private final static QName _AxdEntityInventTableABCTieUp_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "ABCTieUp");
    private final static QName _AxdEntityInventTableSalesPercentMarkup_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "SalesPercentMarkup");
    private final static QName _AxdEntityInventTableStopExplode_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "StopExplode");
    private final static QName _AxdEntityInventTableCostGroupId_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "CostGroupId");
    private final static QName _AxdEntityInventTableItemBuyerGroupId_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "ItemBuyerGroupId");
    private final static QName _AxdEntityInventTableItemPriceToleranceGroupId_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "ItemPriceToleranceGroupId");
    private final static QName _AxdEntityInventTablePBAHideApproval_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "PBAHideApproval");
    private final static QName _AxdEntityInventTableBhnCompany_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "bhnCompany");
    private final static QName _AxdEntityInventTableTaxPackagingQty_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "TaxPackagingQty");
    private final static QName _AxdEntityInventTableBOMManualReceipt_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "BOMManualReceipt");
    private final static QName _AxdEntityInventTableTaraWeight_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "TaraWeight");
    private final static QName _AxdEntityInventTableProjCategoryId_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "projCategoryId");
    private final static QName _AxdEntityInventTablePackagingGroupId_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "PackagingGroupId");
    private final static QName _AxdEntityInventTableBOMUnitId_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "BOMUnitId");
    private final static QName _AxdEntityInventTableBhnSubGroup_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "bhnSubGroup");
    private final static QName _AxdEntityInventTableHeight_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "Height");
    private final static QName _AxdEntityInventTableScrapVar_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "ScrapVar");
    private final static QName _AxdEntityInventTableGrossWidth_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "grossWidth");
    private final static QName _AxdEntityInventTableDocuRefName_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "Name");
    private final static QName _AxdEntityInventTableDocuRefNotes_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "Notes");
    private final static QName _AxdEntityInventTableDocuRefEncyclopediaItemId_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "EncyclopediaItemId");
    private final static QName _AxdEntityInventTableDocuRefTypeId_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "TypeId");
    private final static QName _AxdEntityInventTableDocuRefRefTableId_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "RefTableId");
    private final static QName _AxdEntityInventTableDocuRefRefCompanyId_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "RefCompanyId");
    private final static QName _AxdEntityInventTableDocuRefActualCompanyId_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "ActualCompanyId");
    private final static QName _AxdEntityInventTableDocuRefPartyId_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "PartyId");
    private final static QName _AxdEntityInventTableDocuRefSmmTable_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "smmTable");
    private final static QName _AxdEntityInventTableDocuRefAuthorId_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "AuthorId");
    private final static QName _AxdEntityInventTableDocuRefRefRecId_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "RefRecId");
    private final static QName _AxdEntityInventTableDocuRefContactPersonId_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "ContactPersonId");
    private final static QName _AxdEntityInventTableDocuRefRestriction_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "Restriction");
    private final static QName _AifFaultCustomDetailXml_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Fault", "CustomDetailXml");
    private final static QName _AifFaultFaultMessageListArray_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Fault", "FaultMessageListArray");
    private final static QName _FaultMessageCode_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Fault", "Code");
    private final static QName _FaultMessageMessage_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Fault", "Message");
    private final static QName _AxdItemDocPurpose_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "DocPurpose");
    private final static QName _AxdItemSenderId_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "SenderId");
    private final static QName _AxdEntityInventTxtTxt_QNAME = new QName("http://schemas.microsoft.com/dynamics/2008/01/documents/Item", "Txt");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.microsoft.dynamics.ax
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EntityKey }
     * 
     */
    public EntityKey createEntityKey() {
        return new EntityKey();
    }

    /**
     * Create an instance of {@link KeyField }
     * 
     */
    public KeyField createKeyField() {
        return new KeyField();
    }

    /**
     * Create an instance of {@link KeyData }
     * 
     */
    public KeyData createKeyData() {
        return new KeyData();
    }

    /**
     * Create an instance of {@link EntityKeyList }
     * 
     */
    public EntityKeyList createEntityKeyList() {
        return new EntityKeyList();
    }

    /**
     * Create an instance of {@link AxdItem }
     * 
     */
    public AxdItem createAxdItem() {
        return new AxdItem();
    }

    /**
     * Create an instance of {@link AxdEntityInventTableDocuRef }
     * 
     */
    public AxdEntityInventTableDocuRef createAxdEntityInventTableDocuRef() {
        return new AxdEntityInventTableDocuRef();
    }

    /**
     * Create an instance of {@link AxdEntityInventTable }
     * 
     */
    public AxdEntityInventTable createAxdEntityInventTable() {
        return new AxdEntityInventTable();
    }

    /**
     * Create an instance of {@link AxdEntityInventItemInventSetup }
     * 
     */
    public AxdEntityInventItemInventSetup createAxdEntityInventItemInventSetup() {
        return new AxdEntityInventItemInventSetup();
    }

    /**
     * Create an instance of {@link AxdEntitySales }
     * 
     */
    public AxdEntitySales createAxdEntitySales() {
        return new AxdEntitySales();
    }

    /**
     * Create an instance of {@link AxdEntityInventItemPurchSetup }
     * 
     */
    public AxdEntityInventItemPurchSetup createAxdEntityInventItemPurchSetup() {
        return new AxdEntityInventItemPurchSetup();
    }

    /**
     * Create an instance of {@link AxdEntityInventItemLocation }
     * 
     */
    public AxdEntityInventItemLocation createAxdEntityInventItemLocation() {
        return new AxdEntityInventItemLocation();
    }

    /**
     * Create an instance of {@link AxdEntityInventDimInventSetup }
     * 
     */
    public AxdEntityInventDimInventSetup createAxdEntityInventDimInventSetup() {
        return new AxdEntityInventDimInventSetup();
    }

    /**
     * Create an instance of {@link AxdEntityInventDim }
     * 
     */
    public AxdEntityInventDim createAxdEntityInventDim() {
        return new AxdEntityInventDim();
    }

    /**
     * Create an instance of {@link AxdEntityDefaultInventDimSalesSetup }
     * 
     */
    public AxdEntityDefaultInventDimSalesSetup createAxdEntityDefaultInventDimSalesSetup() {
        return new AxdEntityDefaultInventDimSalesSetup();
    }

    /**
     * Create an instance of {@link AxdEntityDefaultInventDimInventSetup }
     * 
     */
    public AxdEntityDefaultInventDimInventSetup createAxdEntityDefaultInventDimInventSetup() {
        return new AxdEntityDefaultInventDimInventSetup();
    }

    /**
     * Create an instance of {@link AxdEntityInventItemSalesSetup }
     * 
     */
    public AxdEntityInventItemSalesSetup createAxdEntityInventItemSalesSetup() {
        return new AxdEntityInventItemSalesSetup();
    }

    /**
     * Create an instance of {@link AxdArrayAxdExtTypeDimension }
     * 
     */
    public AxdArrayAxdExtTypeDimension createAxdArrayAxdExtTypeDimension() {
        return new AxdArrayAxdExtTypeDimension();
    }

    /**
     * Create an instance of {@link AxdEntityDefaultInventDimPurchSetup }
     * 
     */
    public AxdEntityDefaultInventDimPurchSetup createAxdEntityDefaultInventDimPurchSetup() {
        return new AxdEntityDefaultInventDimPurchSetup();
    }

    /**
     * Create an instance of {@link AxdEntityPurch }
     * 
     */
    public AxdEntityPurch createAxdEntityPurch() {
        return new AxdEntityPurch();
    }

    /**
     * Create an instance of {@link AxdEntityInvent }
     * 
     */
    public AxdEntityInvent createAxdEntityInvent() {
        return new AxdEntityInvent();
    }

    /**
     * Create an instance of {@link AxdEntityInventTxt }
     * 
     */
    public AxdEntityInventTxt createAxdEntityInventTxt() {
        return new AxdEntityInventTxt();
    }

    /**
     * Create an instance of {@link AxdEntityInventDimPurchSetup }
     * 
     */
    public AxdEntityInventDimPurchSetup createAxdEntityInventDimPurchSetup() {
        return new AxdEntityInventDimPurchSetup();
    }

    /**
     * Create an instance of {@link AxdEntityInventDimSalesSetup }
     * 
     */
    public AxdEntityInventDimSalesSetup createAxdEntityInventDimSalesSetup() {
        return new AxdEntityInventDimSalesSetup();
    }

    /**
     * Create an instance of {@link ArrayOfFaultMessage }
     * 
     */
    public ArrayOfFaultMessage createArrayOfFaultMessage() {
        return new ArrayOfFaultMessage();
    }

    /**
     * Create an instance of {@link FaultMessageList }
     * 
     */
    public FaultMessageList createFaultMessageList() {
        return new FaultMessageList();
    }

    /**
     * Create an instance of {@link ArrayOfFaultMessageList }
     * 
     */
    public ArrayOfFaultMessageList createArrayOfFaultMessageList() {
        return new ArrayOfFaultMessageList();
    }

    /**
     * Create an instance of {@link AifFault }
     * 
     */
    public AifFault createAifFault() {
        return new AifFault();
    }

    /**
     * Create an instance of {@link FaultMessage }
     * 
     */
    public FaultMessage createFaultMessage() {
        return new FaultMessage();
    }

    /**
     * Create an instance of {@link ItemServiceFindKeysResponse }
     * 
     */
    public ItemServiceFindKeysResponse createItemServiceFindKeysResponse() {
        return new ItemServiceFindKeysResponse();
    }

    /**
     * Create an instance of {@link ItemServiceCreateRequest }
     * 
     */
    public ItemServiceCreateRequest createItemServiceCreateRequest() {
        return new ItemServiceCreateRequest();
    }

    /**
     * Create an instance of {@link ItemServiceFindKeysRequest }
     * 
     */
    public ItemServiceFindKeysRequest createItemServiceFindKeysRequest() {
        return new ItemServiceFindKeysRequest();
    }

    /**
     * Create an instance of {@link QueryCriteria }
     * 
     */
    public QueryCriteria createQueryCriteria() {
        return new QueryCriteria();
    }

    /**
     * Create an instance of {@link ItemServiceReadRequest }
     * 
     */
    public ItemServiceReadRequest createItemServiceReadRequest() {
        return new ItemServiceReadRequest();
    }

    /**
     * Create an instance of {@link ItemServiceFindRequest }
     * 
     */
    public ItemServiceFindRequest createItemServiceFindRequest() {
        return new ItemServiceFindRequest();
    }

    /**
     * Create an instance of {@link ItemServiceReadResponse }
     * 
     */
    public ItemServiceReadResponse createItemServiceReadResponse() {
        return new ItemServiceReadResponse();
    }

    /**
     * Create an instance of {@link ItemServiceCreateResponse }
     * 
     */
    public ItemServiceCreateResponse createItemServiceCreateResponse() {
        return new ItemServiceCreateResponse();
    }

    /**
     * Create an instance of {@link ItemServiceFindResponse }
     * 
     */
    public ItemServiceFindResponse createItemServiceFindResponse() {
        return new ItemServiceFindResponse();
    }

    /**
     * Create an instance of {@link CriteriaElement }
     * 
     */
    public CriteriaElement createCriteriaElement() {
        return new CriteriaElement();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "Item")
    public JAXBElement<AxdItem> createItem(AxdItem value) {
        return new JAXBElement<AxdItem>(_Item_QNAME, AxdItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2006/02/documents/QueryCriteria", name = "QueryCriteria")
    public JAXBElement<QueryCriteria> createQueryCriteria(QueryCriteria value) {
        return new JAXBElement<QueryCriteria>(_QueryCriteria_QNAME, QueryCriteria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultMessageList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Fault", name = "FaultMessageList")
    public JAXBElement<FaultMessageList> createFaultMessageList(FaultMessageList value) {
        return new JAXBElement<FaultMessageList>(_FaultMessageList_QNAME, FaultMessageList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityKeyList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2006/02/documents/EntityKeyList", name = "EntityKeyList")
    public JAXBElement<EntityKeyList> createEntityKeyList(EntityKeyList value) {
        return new JAXBElement<EntityKeyList>(_EntityKeyList_QNAME, EntityKeyList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AifFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Fault", name = "AifFault")
    public JAXBElement<AifFault> createAifFault(AifFault value) {
        return new JAXBElement<AifFault>(_AifFault_QNAME, AifFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Fault", name = "FaultMessage")
    public JAXBElement<FaultMessage> createFaultMessage(FaultMessage value) {
        return new JAXBElement<FaultMessage>(_FaultMessage_QNAME, FaultMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFaultMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Fault", name = "ArrayOfFaultMessage")
    public JAXBElement<ArrayOfFaultMessage> createArrayOfFaultMessage(ArrayOfFaultMessage value) {
        return new JAXBElement<ArrayOfFaultMessage>(_ArrayOfFaultMessage_QNAME, ArrayOfFaultMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFaultMessageList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Fault", name = "ArrayOfFaultMessageList")
    public JAXBElement<ArrayOfFaultMessageList> createArrayOfFaultMessageList(ArrayOfFaultMessageList value) {
        return new JAXBElement<ArrayOfFaultMessageList>(_ArrayOfFaultMessageList_QNAME, ArrayOfFaultMessageList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityKey }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2006/02/documents/EntityKey", name = "EntityKey")
    public JAXBElement<EntityKey> createEntityKey(EntityKey value) {
        return new JAXBElement<EntityKey>(_EntityKey_QNAME, EntityKey.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "RecVersion", scope = AxdEntityInventItemLocation.class)
    public JAXBElement<Integer> createAxdEntityInventItemLocationRecVersion(Integer value) {
        return new JAXBElement<Integer>(_AxdEntityInventItemLocationRecVersion_QNAME, Integer.class, AxdEntityInventItemLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "WMSLocationIdDefaultReceipt", scope = AxdEntityInventItemLocation.class)
    public JAXBElement<String> createAxdEntityInventItemLocationWMSLocationIdDefaultReceipt(String value) {
        return new JAXBElement<String>(_AxdEntityInventItemLocationWMSLocationIdDefaultReceipt_QNAME, String.class, AxdEntityInventItemLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "inventDimId", scope = AxdEntityInventItemLocation.class)
    public JAXBElement<String> createAxdEntityInventItemLocationInventDimId(String value) {
        return new JAXBElement<String>(_AxdEntityInventItemLocationInventDimId_QNAME, String.class, AxdEntityInventItemLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "CountGroupId", scope = AxdEntityInventItemLocation.class)
    public JAXBElement<String> createAxdEntityInventItemLocationCountGroupId(String value) {
        return new JAXBElement<String>(_AxdEntityInventItemLocationCountGroupId_QNAME, String.class, AxdEntityInventItemLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "CountingJournalId", scope = AxdEntityInventItemLocation.class)
    public JAXBElement<String> createAxdEntityInventItemLocationCountingJournalId(String value) {
        return new JAXBElement<String>(_AxdEntityInventItemLocationCountingJournalId_QNAME, String.class, AxdEntityInventItemLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdExtTypeInventCountingStarted }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "CountingStarted", scope = AxdEntityInventItemLocation.class)
    public JAXBElement<AxdExtTypeInventCountingStarted> createAxdEntityInventItemLocationCountingStarted(AxdExtTypeInventCountingStarted value) {
        return new JAXBElement<AxdExtTypeInventCountingStarted>(_AxdEntityInventItemLocationCountingStarted_QNAME, AxdExtTypeInventCountingStarted.class, AxdEntityInventItemLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "wMSPickingLocation", scope = AxdEntityInventItemLocation.class)
    public JAXBElement<String> createAxdEntityInventItemLocationWMSPickingLocation(String value) {
        return new JAXBElement<String>(_AxdEntityInventItemLocationWMSPickingLocation_QNAME, String.class, AxdEntityInventItemLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "WMSLocationIdDefaultIssue", scope = AxdEntityInventItemLocation.class)
    public JAXBElement<String> createAxdEntityInventItemLocationWMSLocationIdDefaultIssue(String value) {
        return new JAXBElement<String>(_AxdEntityInventItemLocationWMSLocationIdDefaultIssue_QNAME, String.class, AxdEntityInventItemLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "RecId", scope = AxdEntityInventItemLocation.class)
    public JAXBElement<Long> createAxdEntityInventItemLocationRecId(Long value) {
        return new JAXBElement<Long>(_AxdEntityInventItemLocationRecId_QNAME, Long.class, AxdEntityInventItemLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "RecVersion", scope = AxdEntitySales.class)
    public JAXBElement<Integer> createAxdEntitySalesRecVersion(Integer value) {
        return new JAXBElement<Integer>(_AxdEntityInventItemLocationRecVersion_QNAME, Integer.class, AxdEntitySales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdEnumNoYes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "EndDisc", scope = AxdEntitySales.class)
    public JAXBElement<AxdEnumNoYes> createAxdEntitySalesEndDisc(AxdEnumNoYes value) {
        return new JAXBElement<AxdEnumNoYes>(_AxdEntitySalesEndDisc_QNAME, AxdEnumNoYes.class, AxdEntitySales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "PcsPrice", scope = AxdEntitySales.class)
    public JAXBElement<BigDecimal> createAxdEntitySalesPcsPrice(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AxdEntitySalesPcsPrice_QNAME, BigDecimal.class, AxdEntitySales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "Price", scope = AxdEntitySales.class)
    public JAXBElement<BigDecimal> createAxdEntitySalesPrice(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AxdEntitySalesPrice_QNAME, BigDecimal.class, AxdEntitySales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdExtTypePriceAllocateMarkup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "AllocateMarkup", scope = AxdEntitySales.class)
    public JAXBElement<AxdExtTypePriceAllocateMarkup> createAxdEntitySalesAllocateMarkup(AxdExtTypePriceAllocateMarkup value) {
        return new JAXBElement<AxdExtTypePriceAllocateMarkup>(_AxdEntitySalesAllocateMarkup_QNAME, AxdExtTypePriceAllocateMarkup.class, AxdEntitySales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "LineDisc", scope = AxdEntitySales.class)
    public JAXBElement<String> createAxdEntitySalesLineDisc(String value) {
        return new JAXBElement<String>(_AxdEntitySalesLineDisc_QNAME, String.class, AxdEntitySales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "SuppItemGroupId", scope = AxdEntitySales.class)
    public JAXBElement<String> createAxdEntitySalesSuppItemGroupId(String value) {
        return new JAXBElement<String>(_AxdEntitySalesSuppItemGroupId_QNAME, String.class, AxdEntitySales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "UnitId", scope = AxdEntitySales.class)
    public JAXBElement<String> createAxdEntitySalesUnitId(String value) {
        return new JAXBElement<String>(_AxdEntitySalesUnitId_QNAME, String.class, AxdEntitySales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "TaxItemGroupId", scope = AxdEntitySales.class)
    public JAXBElement<String> createAxdEntitySalesTaxItemGroupId(String value) {
        return new JAXBElement<String>(_AxdEntitySalesTaxItemGroupId_QNAME, String.class, AxdEntitySales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "UnderDeliveryPct", scope = AxdEntitySales.class)
    public JAXBElement<BigDecimal> createAxdEntitySalesUnderDeliveryPct(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AxdEntitySalesUnderDeliveryPct_QNAME, BigDecimal.class, AxdEntitySales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "OverDeliveryPct", scope = AxdEntitySales.class)
    public JAXBElement<BigDecimal> createAxdEntitySalesOverDeliveryPct(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AxdEntitySalesOverDeliveryPct_QNAME, BigDecimal.class, AxdEntitySales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "PriceDate", scope = AxdEntitySales.class)
    public JAXBElement<XMLGregorianCalendar> createAxdEntitySalesPriceDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AxdEntitySalesPriceDate_QNAME, XMLGregorianCalendar.class, AxdEntitySales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "Markup", scope = AxdEntitySales.class)
    public JAXBElement<BigDecimal> createAxdEntitySalesMarkup(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AxdEntitySalesMarkup_QNAME, BigDecimal.class, AxdEntitySales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdEnumModuleInventPurchSales }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "ModuleType", scope = AxdEntitySales.class)
    public JAXBElement<AxdEnumModuleInventPurchSales> createAxdEntitySalesModuleType(AxdEnumModuleInventPurchSales value) {
        return new JAXBElement<AxdEnumModuleInventPurchSales>(_AxdEntitySalesModuleType_QNAME, AxdEnumModuleInventPurchSales.class, AxdEntitySales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "RecId", scope = AxdEntitySales.class)
    public JAXBElement<Long> createAxdEntitySalesRecId(Long value) {
        return new JAXBElement<Long>(_AxdEntityInventItemLocationRecId_QNAME, Long.class, AxdEntitySales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "PriceQty", scope = AxdEntitySales.class)
    public JAXBElement<BigDecimal> createAxdEntitySalesPriceQty(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AxdEntitySalesPriceQty_QNAME, BigDecimal.class, AxdEntitySales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdExtTypeInterCompanyBlocked }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "InterCompanyBlocked", scope = AxdEntitySales.class)
    public JAXBElement<AxdExtTypeInterCompanyBlocked> createAxdEntitySalesInterCompanyBlocked(AxdExtTypeInterCompanyBlocked value) {
        return new JAXBElement<AxdExtTypeInterCompanyBlocked>(_AxdEntitySalesInterCompanyBlocked_QNAME, AxdExtTypeInterCompanyBlocked.class, AxdEntitySales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "MarkupGroupId", scope = AxdEntitySales.class)
    public JAXBElement<String> createAxdEntitySalesMarkupGroupId(String value) {
        return new JAXBElement<String>(_AxdEntitySalesMarkupGroupId_QNAME, String.class, AxdEntitySales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "PriceUnit", scope = AxdEntitySales.class)
    public JAXBElement<BigDecimal> createAxdEntitySalesPriceUnit(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AxdEntitySalesPriceUnit_QNAME, BigDecimal.class, AxdEntitySales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "MultiLineDisc", scope = AxdEntitySales.class)
    public JAXBElement<String> createAxdEntitySalesMultiLineDisc(String value) {
        return new JAXBElement<String>(_AxdEntitySalesMultiLineDisc_QNAME, String.class, AxdEntitySales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Fault", name = "ServiceOperationParameter", scope = FaultMessageList.class)
    public JAXBElement<String> createFaultMessageListServiceOperationParameter(String value) {
        return new JAXBElement<String>(_FaultMessageListServiceOperationParameter_QNAME, String.class, FaultMessageList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFaultMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Fault", name = "FaultMessageArray", scope = FaultMessageList.class)
    public JAXBElement<ArrayOfFaultMessage> createFaultMessageListFaultMessageArray(ArrayOfFaultMessage value) {
        return new JAXBElement<ArrayOfFaultMessage>(_FaultMessageListFaultMessageArray_QNAME, ArrayOfFaultMessage.class, FaultMessageList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Fault", name = "XPath", scope = FaultMessageList.class)
    public JAXBElement<String> createFaultMessageListXPath(String value) {
        return new JAXBElement<String>(_FaultMessageListXPath_QNAME, String.class, FaultMessageList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Fault", name = "Field", scope = FaultMessageList.class)
    public JAXBElement<String> createFaultMessageListField(String value) {
        return new JAXBElement<String>(_FaultMessageListField_QNAME, String.class, FaultMessageList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Fault", name = "Service", scope = FaultMessageList.class)
    public JAXBElement<String> createFaultMessageListService(String value) {
        return new JAXBElement<String>(_FaultMessageListService_QNAME, String.class, FaultMessageList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Fault", name = "Document", scope = FaultMessageList.class)
    public JAXBElement<String> createFaultMessageListDocument(String value) {
        return new JAXBElement<String>(_FaultMessageListDocument_QNAME, String.class, FaultMessageList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Fault", name = "XmlPosition", scope = FaultMessageList.class)
    public JAXBElement<String> createFaultMessageListXmlPosition(String value) {
        return new JAXBElement<String>(_FaultMessageListXmlPosition_QNAME, String.class, FaultMessageList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Fault", name = "XmlLine", scope = FaultMessageList.class)
    public JAXBElement<String> createFaultMessageListXmlLine(String value) {
        return new JAXBElement<String>(_FaultMessageListXmlLine_QNAME, String.class, FaultMessageList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Fault", name = "ServiceOperation", scope = FaultMessageList.class)
    public JAXBElement<String> createFaultMessageListServiceOperation(String value) {
        return new JAXBElement<String>(_FaultMessageListServiceOperation_QNAME, String.class, FaultMessageList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Fault", name = "DocumentOperation", scope = FaultMessageList.class)
    public JAXBElement<String> createFaultMessageListDocumentOperation(String value) {
        return new JAXBElement<String>(_FaultMessageListDocumentOperation_QNAME, String.class, FaultMessageList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "RecVersion", scope = AxdEntityInventDimSalesSetup.class)
    public JAXBElement<Integer> createAxdEntityInventDimSalesSetupRecVersion(Integer value) {
        return new JAXBElement<Integer>(_AxdEntityInventItemLocationRecVersion_QNAME, Integer.class, AxdEntityInventDimSalesSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "InventSiteId", scope = AxdEntityInventDimSalesSetup.class)
    public JAXBElement<String> createAxdEntityInventDimSalesSetupInventSiteId(String value) {
        return new JAXBElement<String>(_AxdEntityInventDimSalesSetupInventSiteId_QNAME, String.class, AxdEntityInventDimSalesSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "inventDimId", scope = AxdEntityInventDimSalesSetup.class)
    public JAXBElement<String> createAxdEntityInventDimSalesSetupInventDimId(String value) {
        return new JAXBElement<String>(_AxdEntityInventItemLocationInventDimId_QNAME, String.class, AxdEntityInventDimSalesSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "wMSLocationId", scope = AxdEntityInventDimSalesSetup.class)
    public JAXBElement<String> createAxdEntityInventDimSalesSetupWMSLocationId(String value) {
        return new JAXBElement<String>(_AxdEntityInventDimSalesSetupWMSLocationId_QNAME, String.class, AxdEntityInventDimSalesSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "inventSerialId", scope = AxdEntityInventDimSalesSetup.class)
    public JAXBElement<String> createAxdEntityInventDimSalesSetupInventSerialId(String value) {
        return new JAXBElement<String>(_AxdEntityInventDimSalesSetupInventSerialId_QNAME, String.class, AxdEntityInventDimSalesSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "RecId", scope = AxdEntityInventDimSalesSetup.class)
    public JAXBElement<Long> createAxdEntityInventDimSalesSetupRecId(Long value) {
        return new JAXBElement<Long>(_AxdEntityInventItemLocationRecId_QNAME, Long.class, AxdEntityInventDimSalesSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "InventBatchId", scope = AxdEntityInventDimSalesSetup.class)
    public JAXBElement<String> createAxdEntityInventDimSalesSetupInventBatchId(String value) {
        return new JAXBElement<String>(_AxdEntityInventDimSalesSetupInventBatchId_QNAME, String.class, AxdEntityInventDimSalesSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "InventLocationId", scope = AxdEntityInventDimSalesSetup.class)
    public JAXBElement<String> createAxdEntityInventDimSalesSetupInventLocationId(String value) {
        return new JAXBElement<String>(_AxdEntityInventDimSalesSetupInventLocationId_QNAME, String.class, AxdEntityInventDimSalesSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "RecVersion", scope = AxdEntityDefaultInventDimPurchSetup.class)
    public JAXBElement<Integer> createAxdEntityDefaultInventDimPurchSetupRecVersion(Integer value) {
        return new JAXBElement<Integer>(_AxdEntityInventItemLocationRecVersion_QNAME, Integer.class, AxdEntityDefaultInventDimPurchSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "InventSiteId", scope = AxdEntityDefaultInventDimPurchSetup.class)
    public JAXBElement<String> createAxdEntityDefaultInventDimPurchSetupInventSiteId(String value) {
        return new JAXBElement<String>(_AxdEntityInventDimSalesSetupInventSiteId_QNAME, String.class, AxdEntityDefaultInventDimPurchSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "inventDimId", scope = AxdEntityDefaultInventDimPurchSetup.class)
    public JAXBElement<String> createAxdEntityDefaultInventDimPurchSetupInventDimId(String value) {
        return new JAXBElement<String>(_AxdEntityInventItemLocationInventDimId_QNAME, String.class, AxdEntityDefaultInventDimPurchSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "wMSLocationId", scope = AxdEntityDefaultInventDimPurchSetup.class)
    public JAXBElement<String> createAxdEntityDefaultInventDimPurchSetupWMSLocationId(String value) {
        return new JAXBElement<String>(_AxdEntityInventDimSalesSetupWMSLocationId_QNAME, String.class, AxdEntityDefaultInventDimPurchSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "inventSerialId", scope = AxdEntityDefaultInventDimPurchSetup.class)
    public JAXBElement<String> createAxdEntityDefaultInventDimPurchSetupInventSerialId(String value) {
        return new JAXBElement<String>(_AxdEntityInventDimSalesSetupInventSerialId_QNAME, String.class, AxdEntityDefaultInventDimPurchSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "RecId", scope = AxdEntityDefaultInventDimPurchSetup.class)
    public JAXBElement<Long> createAxdEntityDefaultInventDimPurchSetupRecId(Long value) {
        return new JAXBElement<Long>(_AxdEntityInventItemLocationRecId_QNAME, Long.class, AxdEntityDefaultInventDimPurchSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "InventBatchId", scope = AxdEntityDefaultInventDimPurchSetup.class)
    public JAXBElement<String> createAxdEntityDefaultInventDimPurchSetupInventBatchId(String value) {
        return new JAXBElement<String>(_AxdEntityInventDimSalesSetupInventBatchId_QNAME, String.class, AxdEntityDefaultInventDimPurchSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "InventLocationId", scope = AxdEntityDefaultInventDimPurchSetup.class)
    public JAXBElement<String> createAxdEntityDefaultInventDimPurchSetupInventLocationId(String value) {
        return new JAXBElement<String>(_AxdEntityInventDimSalesSetupInventLocationId_QNAME, String.class, AxdEntityDefaultInventDimPurchSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "RecVersion", scope = AxdEntityInventItemSalesSetup.class)
    public JAXBElement<Integer> createAxdEntityInventItemSalesSetupRecVersion(Integer value) {
        return new JAXBElement<Integer>(_AxdEntityInventItemLocationRecVersion_QNAME, Integer.class, AxdEntityInventItemSalesSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdExtTypeItemStopped }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "Stopped", scope = AxdEntityInventItemSalesSetup.class)
    public JAXBElement<AxdExtTypeItemStopped> createAxdEntityInventItemSalesSetupStopped(AxdExtTypeItemStopped value) {
        return new JAXBElement<AxdExtTypeItemStopped>(_AxdEntityInventItemSalesSetupStopped_QNAME, AxdExtTypeItemStopped.class, AxdEntityInventItemSalesSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "HighestQty", scope = AxdEntityInventItemSalesSetup.class)
    public JAXBElement<BigDecimal> createAxdEntityInventItemSalesSetupHighestQty(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AxdEntityInventItemSalesSetupHighestQty_QNAME, BigDecimal.class, AxdEntityInventItemSalesSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdEnumSalesDeliveryDateControlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "DeliveryDateControlType", scope = AxdEntityInventItemSalesSetup.class)
    public JAXBElement<AxdEnumSalesDeliveryDateControlType> createAxdEntityInventItemSalesSetupDeliveryDateControlType(AxdEnumSalesDeliveryDateControlType value) {
        return new JAXBElement<AxdEnumSalesDeliveryDateControlType>(_AxdEntityInventItemSalesSetupDeliveryDateControlType_QNAME, AxdEnumSalesDeliveryDateControlType.class, AxdEntityInventItemSalesSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "InventDimId", scope = AxdEntityInventItemSalesSetup.class)
    public JAXBElement<String> createAxdEntityInventItemSalesSetupInventDimId(String value) {
        return new JAXBElement<String>(_AxdEntityInventItemSalesSetupInventDimId_QNAME, String.class, AxdEntityInventItemSalesSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdExtTypeNoYesId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "Override", scope = AxdEntityInventItemSalesSetup.class)
    public JAXBElement<AxdExtTypeNoYesId> createAxdEntityInventItemSalesSetupOverride(AxdExtTypeNoYesId value) {
        return new JAXBElement<AxdExtTypeNoYesId>(_AxdEntityInventItemSalesSetupOverride_QNAME, AxdExtTypeNoYesId.class, AxdEntityInventItemSalesSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "MultipleQty", scope = AxdEntityInventItemSalesSetup.class)
    public JAXBElement<BigDecimal> createAxdEntityInventItemSalesSetupMultipleQty(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AxdEntityInventItemSalesSetupMultipleQty_QNAME, BigDecimal.class, AxdEntityInventItemSalesSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "ATPTimeFence", scope = AxdEntityInventItemSalesSetup.class)
    public JAXBElement<Integer> createAxdEntityInventItemSalesSetupATPTimeFence(Integer value) {
        return new JAXBElement<Integer>(_AxdEntityInventItemSalesSetupATPTimeFence_QNAME, Integer.class, AxdEntityInventItemSalesSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "StandardQty", scope = AxdEntityInventItemSalesSetup.class)
    public JAXBElement<BigDecimal> createAxdEntityInventItemSalesSetupStandardQty(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AxdEntityInventItemSalesSetupStandardQty_QNAME, BigDecimal.class, AxdEntityInventItemSalesSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "LeadTime", scope = AxdEntityInventItemSalesSetup.class)
    public JAXBElement<Integer> createAxdEntityInventItemSalesSetupLeadTime(Integer value) {
        return new JAXBElement<Integer>(_AxdEntityInventItemSalesSetupLeadTime_QNAME, Integer.class, AxdEntityInventItemSalesSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdExtTypeSalesATPInclPlannedOrders }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "ATPInclPlannedOrders", scope = AxdEntityInventItemSalesSetup.class)
    public JAXBElement<AxdExtTypeSalesATPInclPlannedOrders> createAxdEntityInventItemSalesSetupATPInclPlannedOrders(AxdExtTypeSalesATPInclPlannedOrders value) {
        return new JAXBElement<AxdExtTypeSalesATPInclPlannedOrders>(_AxdEntityInventItemSalesSetupATPInclPlannedOrders_QNAME, AxdExtTypeSalesATPInclPlannedOrders.class, AxdEntityInventItemSalesSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdExtTypeNoYesId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "MandatoryInventSite", scope = AxdEntityInventItemSalesSetup.class)
    public JAXBElement<AxdExtTypeNoYesId> createAxdEntityInventItemSalesSetupMandatoryInventSite(AxdExtTypeNoYesId value) {
        return new JAXBElement<AxdExtTypeNoYesId>(_AxdEntityInventItemSalesSetupMandatoryInventSite_QNAME, AxdExtTypeNoYesId.class, AxdEntityInventItemSalesSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "RecId", scope = AxdEntityInventItemSalesSetup.class)
    public JAXBElement<Long> createAxdEntityInventItemSalesSetupRecId(Long value) {
        return new JAXBElement<Long>(_AxdEntityInventItemLocationRecId_QNAME, Long.class, AxdEntityInventItemSalesSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdExtTypeNoYesId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "MandatoryInventLocation", scope = AxdEntityInventItemSalesSetup.class)
    public JAXBElement<AxdExtTypeNoYesId> createAxdEntityInventItemSalesSetupMandatoryInventLocation(AxdExtTypeNoYesId value) {
        return new JAXBElement<AxdExtTypeNoYesId>(_AxdEntityInventItemSalesSetupMandatoryInventLocation_QNAME, AxdExtTypeNoYesId.class, AxdEntityInventItemSalesSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "InventDimIdDefault", scope = AxdEntityInventItemSalesSetup.class)
    public JAXBElement<String> createAxdEntityInventItemSalesSetupInventDimIdDefault(String value) {
        return new JAXBElement<String>(_AxdEntityInventItemSalesSetupInventDimIdDefault_QNAME, String.class, AxdEntityInventItemSalesSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "LowestQty", scope = AxdEntityInventItemSalesSetup.class)
    public JAXBElement<BigDecimal> createAxdEntityInventItemSalesSetupLowestQty(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AxdEntityInventItemSalesSetupLowestQty_QNAME, BigDecimal.class, AxdEntityInventItemSalesSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "RecVersion", scope = AxdEntityInventDim.class)
    public JAXBElement<Integer> createAxdEntityInventDimRecVersion(Integer value) {
        return new JAXBElement<Integer>(_AxdEntityInventItemLocationRecVersion_QNAME, Integer.class, AxdEntityInventDim.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "InventSiteId", scope = AxdEntityInventDim.class)
    public JAXBElement<String> createAxdEntityInventDimInventSiteId(String value) {
        return new JAXBElement<String>(_AxdEntityInventDimSalesSetupInventSiteId_QNAME, String.class, AxdEntityInventDim.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "inventDimId", scope = AxdEntityInventDim.class)
    public JAXBElement<String> createAxdEntityInventDimInventDimId(String value) {
        return new JAXBElement<String>(_AxdEntityInventItemLocationInventDimId_QNAME, String.class, AxdEntityInventDim.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "wMSLocationId", scope = AxdEntityInventDim.class)
    public JAXBElement<String> createAxdEntityInventDimWMSLocationId(String value) {
        return new JAXBElement<String>(_AxdEntityInventDimSalesSetupWMSLocationId_QNAME, String.class, AxdEntityInventDim.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "inventSerialId", scope = AxdEntityInventDim.class)
    public JAXBElement<String> createAxdEntityInventDimInventSerialId(String value) {
        return new JAXBElement<String>(_AxdEntityInventDimSalesSetupInventSerialId_QNAME, String.class, AxdEntityInventDim.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "RecId", scope = AxdEntityInventDim.class)
    public JAXBElement<Long> createAxdEntityInventDimRecId(Long value) {
        return new JAXBElement<Long>(_AxdEntityInventItemLocationRecId_QNAME, Long.class, AxdEntityInventDim.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "InventBatchId", scope = AxdEntityInventDim.class)
    public JAXBElement<String> createAxdEntityInventDimInventBatchId(String value) {
        return new JAXBElement<String>(_AxdEntityInventDimSalesSetupInventBatchId_QNAME, String.class, AxdEntityInventDim.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "InventLocationId", scope = AxdEntityInventDim.class)
    public JAXBElement<String> createAxdEntityInventDimInventLocationId(String value) {
        return new JAXBElement<String>(_AxdEntityInventDimSalesSetupInventLocationId_QNAME, String.class, AxdEntityInventDim.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "RecVersion", scope = AxdEntityInventItemPurchSetup.class)
    public JAXBElement<Integer> createAxdEntityInventItemPurchSetupRecVersion(Integer value) {
        return new JAXBElement<Integer>(_AxdEntityInventItemLocationRecVersion_QNAME, Integer.class, AxdEntityInventItemPurchSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdExtTypeItemStopped }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "Stopped", scope = AxdEntityInventItemPurchSetup.class)
    public JAXBElement<AxdExtTypeItemStopped> createAxdEntityInventItemPurchSetupStopped(AxdExtTypeItemStopped value) {
        return new JAXBElement<AxdExtTypeItemStopped>(_AxdEntityInventItemSalesSetupStopped_QNAME, AxdExtTypeItemStopped.class, AxdEntityInventItemPurchSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "HighestQty", scope = AxdEntityInventItemPurchSetup.class)
    public JAXBElement<BigDecimal> createAxdEntityInventItemPurchSetupHighestQty(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AxdEntityInventItemSalesSetupHighestQty_QNAME, BigDecimal.class, AxdEntityInventItemPurchSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "InventDimId", scope = AxdEntityInventItemPurchSetup.class)
    public JAXBElement<String> createAxdEntityInventItemPurchSetupInventDimId(String value) {
        return new JAXBElement<String>(_AxdEntityInventItemSalesSetupInventDimId_QNAME, String.class, AxdEntityInventItemPurchSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdExtTypeCalendarDays }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "CalendarDays", scope = AxdEntityInventItemPurchSetup.class)
    public JAXBElement<AxdExtTypeCalendarDays> createAxdEntityInventItemPurchSetupCalendarDays(AxdExtTypeCalendarDays value) {
        return new JAXBElement<AxdExtTypeCalendarDays>(_AxdEntityInventItemPurchSetupCalendarDays_QNAME, AxdExtTypeCalendarDays.class, AxdEntityInventItemPurchSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdExtTypeNoYesId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "Override", scope = AxdEntityInventItemPurchSetup.class)
    public JAXBElement<AxdExtTypeNoYesId> createAxdEntityInventItemPurchSetupOverride(AxdExtTypeNoYesId value) {
        return new JAXBElement<AxdExtTypeNoYesId>(_AxdEntityInventItemSalesSetupOverride_QNAME, AxdExtTypeNoYesId.class, AxdEntityInventItemPurchSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "MultipleQty", scope = AxdEntityInventItemPurchSetup.class)
    public JAXBElement<BigDecimal> createAxdEntityInventItemPurchSetupMultipleQty(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AxdEntityInventItemSalesSetupMultipleQty_QNAME, BigDecimal.class, AxdEntityInventItemPurchSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "StandardQty", scope = AxdEntityInventItemPurchSetup.class)
    public JAXBElement<BigDecimal> createAxdEntityInventItemPurchSetupStandardQty(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AxdEntityInventItemSalesSetupStandardQty_QNAME, BigDecimal.class, AxdEntityInventItemPurchSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "LeadTime", scope = AxdEntityInventItemPurchSetup.class)
    public JAXBElement<Integer> createAxdEntityInventItemPurchSetupLeadTime(Integer value) {
        return new JAXBElement<Integer>(_AxdEntityInventItemSalesSetupLeadTime_QNAME, Integer.class, AxdEntityInventItemPurchSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdExtTypeNoYesId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "MandatoryInventSite", scope = AxdEntityInventItemPurchSetup.class)
    public JAXBElement<AxdExtTypeNoYesId> createAxdEntityInventItemPurchSetupMandatoryInventSite(AxdExtTypeNoYesId value) {
        return new JAXBElement<AxdExtTypeNoYesId>(_AxdEntityInventItemSalesSetupMandatoryInventSite_QNAME, AxdExtTypeNoYesId.class, AxdEntityInventItemPurchSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdExtTypeNoYesId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "MandatoryInventLocation", scope = AxdEntityInventItemPurchSetup.class)
    public JAXBElement<AxdExtTypeNoYesId> createAxdEntityInventItemPurchSetupMandatoryInventLocation(AxdExtTypeNoYesId value) {
        return new JAXBElement<AxdExtTypeNoYesId>(_AxdEntityInventItemSalesSetupMandatoryInventLocation_QNAME, AxdExtTypeNoYesId.class, AxdEntityInventItemPurchSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "RecId", scope = AxdEntityInventItemPurchSetup.class)
    public JAXBElement<Long> createAxdEntityInventItemPurchSetupRecId(Long value) {
        return new JAXBElement<Long>(_AxdEntityInventItemLocationRecId_QNAME, Long.class, AxdEntityInventItemPurchSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "InventDimIdDefault", scope = AxdEntityInventItemPurchSetup.class)
    public JAXBElement<String> createAxdEntityInventItemPurchSetupInventDimIdDefault(String value) {
        return new JAXBElement<String>(_AxdEntityInventItemSalesSetupInventDimIdDefault_QNAME, String.class, AxdEntityInventItemPurchSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "LowestQty", scope = AxdEntityInventItemPurchSetup.class)
    public JAXBElement<BigDecimal> createAxdEntityInventItemPurchSetupLowestQty(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AxdEntityInventItemSalesSetupLowestQty_QNAME, BigDecimal.class, AxdEntityInventItemPurchSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "RecVersion", scope = AxdEntityInventTable.class)
    public JAXBElement<Integer> createAxdEntityInventTableRecVersion(Integer value) {
        return new JAXBElement<Integer>(_AxdEntityInventItemLocationRecVersion_QNAME, Integer.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdEnumABC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "ABCContributionMargin", scope = AxdEntityInventTable.class)
    public JAXBElement<AxdEnumABC> createAxdEntityInventTableABCContributionMargin(AxdEnumABC value) {
        return new JAXBElement<AxdEnumABC>(_AxdEntityInventTableABCContributionMargin_QNAME, AxdEnumABC.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdExtTypeItemDimCombinationAutoCreate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "ItemDimCombinationAutoCreate", scope = AxdEntityInventTable.class)
    public JAXBElement<AxdExtTypeItemDimCombinationAutoCreate> createAxdEntityInventTableItemDimCombinationAutoCreate(AxdExtTypeItemDimCombinationAutoCreate value) {
        return new JAXBElement<AxdExtTypeItemDimCombinationAutoCreate>(_AxdEntityInventTableItemDimCombinationAutoCreate_QNAME, AxdExtTypeItemDimCombinationAutoCreate.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "ItemName", scope = AxdEntityInventTable.class)
    public JAXBElement<String> createAxdEntityInventTableItemName(String value) {
        return new JAXBElement<String>(_AxdEntityInventTableItemName_QNAME, String.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdEnumItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "ItemType", scope = AxdEntityInventTable.class)
    public JAXBElement<AxdEnumItemType> createAxdEntityInventTableItemType(AxdEnumItemType value) {
        return new JAXBElement<AxdEnumItemType>(_AxdEntityInventTableItemType_QNAME, AxdEnumItemType.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "ReqGroupId", scope = AxdEntityInventTable.class)
    public JAXBElement<String> createAxdEntityInventTableReqGroupId(String value) {
        return new JAXBElement<String>(_AxdEntityInventTableReqGroupId_QNAME, String.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "WMSArrivalHandlingTime", scope = AxdEntityInventTable.class)
    public JAXBElement<XMLGregorianCalendar> createAxdEntityInventTableWMSArrivalHandlingTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AxdEntityInventTableWMSArrivalHandlingTime_QNAME, XMLGregorianCalendar.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdExtTypeItemSalesModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "SalesModel", scope = AxdEntityInventTable.class)
    public JAXBElement<AxdExtTypeItemSalesModel> createAxdEntityInventTableSalesModel(AxdExtTypeItemSalesModel value) {
        return new JAXBElement<AxdExtTypeItemSalesModel>(_AxdEntityInventTableSalesModel_QNAME, AxdExtTypeItemSalesModel.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "grossHeight", scope = AxdEntityInventTable.class)
    public JAXBElement<BigDecimal> createAxdEntityInventTableGrossHeight(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AxdEntityInventTableGrossHeight_QNAME, BigDecimal.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "BOMCalcGroupId", scope = AxdEntityInventTable.class)
    public JAXBElement<String> createAxdEntityInventTableBOMCalcGroupId(String value) {
        return new JAXBElement<String>(_AxdEntityInventTableBOMCalcGroupId_QNAME, String.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdExtTypeItemDimCostPrice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "ItemDimCostPrice", scope = AxdEntityInventTable.class)
    public JAXBElement<AxdExtTypeItemDimCostPrice> createAxdEntityInventTableItemDimCostPrice(AxdExtTypeItemDimCostPrice value) {
        return new JAXBElement<AxdExtTypeItemDimCostPrice>(_AxdEntityInventTableItemDimCostPrice_QNAME, AxdExtTypeItemDimCostPrice.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "jsSellStartDate", scope = AxdEntityInventTable.class)
    public JAXBElement<XMLGregorianCalendar> createAxdEntityInventTableJsSellStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AxdEntityInventTableJsSellStartDate_QNAME, XMLGregorianCalendar.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "ProdPoolId", scope = AxdEntityInventTable.class)
    public JAXBElement<String> createAxdEntityInventTableProdPoolId(String value) {
        return new JAXBElement<String>(_AxdEntityInventTableProdPoolId_QNAME, String.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "bhnDivision", scope = AxdEntityInventTable.class)
    public JAXBElement<String> createAxdEntityInventTableBhnDivision(String value) {
        return new JAXBElement<String>(_AxdEntityInventTableBhnDivision_QNAME, String.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "NameAlias", scope = AxdEntityInventTable.class)
    public JAXBElement<String> createAxdEntityInventTableNameAlias(String value) {
        return new JAXBElement<String>(_AxdEntityInventTableNameAlias_QNAME, String.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "ProdGroupId", scope = AxdEntityInventTable.class)
    public JAXBElement<String> createAxdEntityInventTableProdGroupId(String value) {
        return new JAXBElement<String>(_AxdEntityInventTableProdGroupId_QNAME, String.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdExtTypePBAAutostart }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "PBAAutoStart", scope = AxdEntityInventTable.class)
    public JAXBElement<AxdExtTypePBAAutostart> createAxdEntityInventTablePBAAutoStart(AxdExtTypePBAAutostart value) {
        return new JAXBElement<AxdExtTypePBAAutostart>(_AxdEntityInventTablePBAAutoStart_QNAME, AxdExtTypePBAAutostart.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "sortCode", scope = AxdEntityInventTable.class)
    public JAXBElement<Integer> createAxdEntityInventTableSortCode(Integer value) {
        return new JAXBElement<Integer>(_AxdEntityInventTableSortCode_QNAME, Integer.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdExtTypePBAMandatoryConfig }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "PBAMandatoryConfig", scope = AxdEntityInventTable.class)
    public JAXBElement<AxdExtTypePBAMandatoryConfig> createAxdEntityInventTablePBAMandatoryConfig(AxdExtTypePBAMandatoryConfig value) {
        return new JAXBElement<AxdExtTypePBAMandatoryConfig>(_AxdEntityInventTablePBAMandatoryConfig_QNAME, AxdExtTypePBAMandatoryConfig.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdEnumABC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "ABCRevenue", scope = AxdEntityInventTable.class)
    public JAXBElement<AxdEnumABC> createAxdEntityInventTableABCRevenue(AxdEnumABC value) {
        return new JAXBElement<AxdEnumABC>(_AxdEntityInventTableABCRevenue_QNAME, AxdEnumABC.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "BatchNumGroupId", scope = AxdEntityInventTable.class)
    public JAXBElement<String> createAxdEntityInventTableBatchNumGroupId(String value) {
        return new JAXBElement<String>(_AxdEntityInventTableBatchNumGroupId_QNAME, String.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "OrigCountryRegionId", scope = AxdEntityInventTable.class)
    public JAXBElement<String> createAxdEntityInventTableOrigCountryRegionId(String value) {
        return new JAXBElement<String>(_AxdEntityInventTableOrigCountryRegionId_QNAME, String.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "jsSellEndDate", scope = AxdEntityInventTable.class)
    public JAXBElement<XMLGregorianCalendar> createAxdEntityInventTableJsSellEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AxdEntityInventTableJsSellEndDate_QNAME, XMLGregorianCalendar.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "Depth", scope = AxdEntityInventTable.class)
    public JAXBElement<BigDecimal> createAxdEntityInventTableDepth(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AxdEntityInventTableDepth_QNAME, BigDecimal.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdEnumABC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "ABCValue", scope = AxdEntityInventTable.class)
    public JAXBElement<AxdEnumABC> createAxdEntityInventTableABCValue(AxdEnumABC value) {
        return new JAXBElement<AxdEnumABC>(_AxdEntityInventTableABCValue_QNAME, AxdEnumABC.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "PrimaryVendorId", scope = AxdEntityInventTable.class)
    public JAXBElement<String> createAxdEntityInventTablePrimaryVendorId(String value) {
        return new JAXBElement<String>(_AxdEntityInventTablePrimaryVendorId_QNAME, String.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "EPCManager", scope = AxdEntityInventTable.class)
    public JAXBElement<BigDecimal> createAxdEntityInventTableEPCManager(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AxdEntityInventTableEPCManager_QNAME, BigDecimal.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdExtTypeItemPhantom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "Phantom", scope = AxdEntityInventTable.class)
    public JAXBElement<AxdExtTypeItemPhantom> createAxdEntityInventTablePhantom(AxdExtTypeItemPhantom value) {
        return new JAXBElement<AxdExtTypeItemPhantom>(_AxdEntityInventTablePhantom_QNAME, AxdExtTypeItemPhantom.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "NetWeight", scope = AxdEntityInventTable.class)
    public JAXBElement<BigDecimal> createAxdEntityInventTableNetWeight(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AxdEntityInventTableNetWeight_QNAME, BigDecimal.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdExtTypePBAHideDialog }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "PBAHideDialog", scope = AxdEntityInventTable.class)
    public JAXBElement<AxdExtTypePBAHideDialog> createAxdEntityInventTablePBAHideDialog(AxdExtTypePBAHideDialog value) {
        return new JAXBElement<AxdExtTypePBAHideDialog>(_AxdEntityInventTablePBAHideDialog_QNAME, AxdExtTypePBAHideDialog.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "grossDepth", scope = AxdEntityInventTable.class)
    public JAXBElement<BigDecimal> createAxdEntityInventTableGrossDepth(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AxdEntityInventTableGrossDepth_QNAME, BigDecimal.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdExtTypeItemUseAlternative }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "UseAltItemId", scope = AxdEntityInventTable.class)
    public JAXBElement<AxdExtTypeItemUseAlternative> createAxdEntityInventTableUseAltItemId(AxdExtTypeItemUseAlternative value) {
        return new JAXBElement<AxdExtTypeItemUseAlternative>(_AxdEntityInventTableUseAltItemId_QNAME, AxdExtTypeItemUseAlternative.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "SalesContributionRatio", scope = AxdEntityInventTable.class)
    public JAXBElement<BigDecimal> createAxdEntityInventTableSalesContributionRatio(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AxdEntityInventTableSalesContributionRatio_QNAME, BigDecimal.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "PBAInventItemGroupId", scope = AxdEntityInventTable.class)
    public JAXBElement<String> createAxdEntityInventTablePBAInventItemGroupId(String value) {
        return new JAXBElement<String>(_AxdEntityInventTablePBAInventItemGroupId_QNAME, String.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "_DocumentHash", scope = AxdEntityInventTable.class)
    public JAXBElement<String> createAxdEntityInventTableDocumentHash(String value) {
        return new JAXBElement<String>(_AxdEntityInventTableDocumentHash_QNAME, String.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "UnitVolume", scope = AxdEntityInventTable.class)
    public JAXBElement<BigDecimal> createAxdEntityInventTableUnitVolume(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AxdEntityInventTableUnitVolume_QNAME, BigDecimal.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "SerialNumGroupId", scope = AxdEntityInventTable.class)
    public JAXBElement<String> createAxdEntityInventTableSerialNumGroupId(String value) {
        return new JAXBElement<String>(_AxdEntityInventTableSerialNumGroupId_QNAME, String.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "ItemId", scope = AxdEntityInventTable.class)
    public JAXBElement<String> createAxdEntityInventTableItemId(String value) {
        return new JAXBElement<String>(_AxdEntityInventTableItemId_QNAME, String.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdEnumSalesPriceModelBasic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "SalesPriceModelBasic", scope = AxdEntityInventTable.class)
    public JAXBElement<AxdEnumSalesPriceModelBasic> createAxdEntityInventTableSalesPriceModelBasic(AxdEnumSalesPriceModelBasic value) {
        return new JAXBElement<AxdEnumSalesPriceModelBasic>(_AxdEntityInventTableSalesPriceModelBasic_QNAME, AxdEnumSalesPriceModelBasic.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "Density", scope = AxdEntityInventTable.class)
    public JAXBElement<BigDecimal> createAxdEntityInventTableDensity(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AxdEntityInventTableDensity_QNAME, BigDecimal.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdArrayAxdExtTypeDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "Dimension", scope = AxdEntityInventTable.class)
    public JAXBElement<AxdArrayAxdExtTypeDimension> createAxdEntityInventTableDimension(AxdArrayAxdExtTypeDimension value) {
        return new JAXBElement<AxdArrayAxdExtTypeDimension>(_AxdEntityInventTableDimension_QNAME, AxdArrayAxdExtTypeDimension.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "Intracode", scope = AxdEntityInventTable.class)
    public JAXBElement<String> createAxdEntityInventTableIntracode(String value) {
        return new JAXBElement<String>(_AxdEntityInventTableIntracode_QNAME, String.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "IntraUnit", scope = AxdEntityInventTable.class)
    public JAXBElement<BigDecimal> createAxdEntityInventTableIntraUnit(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AxdEntityInventTableIntraUnit_QNAME, BigDecimal.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "StatisticsFactor", scope = AxdEntityInventTable.class)
    public JAXBElement<BigDecimal> createAxdEntityInventTableStatisticsFactor(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AxdEntityInventTableStatisticsFactor_QNAME, BigDecimal.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "RecId", scope = AxdEntityInventTable.class)
    public JAXBElement<Long> createAxdEntityInventTableRecId(Long value) {
        return new JAXBElement<Long>(_AxdEntityInventItemLocationRecId_QNAME, Long.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "AltItemId", scope = AxdEntityInventTable.class)
    public JAXBElement<String> createAxdEntityInventTableAltItemId(String value) {
        return new JAXBElement<String>(_AxdEntityInventTableAltItemId_QNAME, String.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdExtTypePBAItemAutoGenerated }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "PBAItemAutoGenerated", scope = AxdEntityInventTable.class)
    public JAXBElement<AxdExtTypePBAItemAutoGenerated> createAxdEntityInventTablePBAItemAutoGenerated(AxdExtTypePBAItemAutoGenerated value) {
        return new JAXBElement<AxdExtTypePBAItemAutoGenerated>(_AxdEntityInventTablePBAItemAutoGenerated_QNAME, AxdExtTypePBAItemAutoGenerated.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "Width", scope = AxdEntityInventTable.class)
    public JAXBElement<BigDecimal> createAxdEntityInventTableWidth(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AxdEntityInventTableWidth_QNAME, BigDecimal.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "ItemIdCompany", scope = AxdEntityInventTable.class)
    public JAXBElement<String> createAxdEntityInventTableItemIdCompany(String value) {
        return new JAXBElement<String>(_AxdEntityInventTableItemIdCompany_QNAME, String.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "OrigStateId", scope = AxdEntityInventTable.class)
    public JAXBElement<String> createAxdEntityInventTableOrigStateId(String value) {
        return new JAXBElement<String>(_AxdEntityInventTableOrigStateId_QNAME, String.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdExtTypeItemCostModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "CostModel", scope = AxdEntityInventTable.class)
    public JAXBElement<AxdExtTypeItemCostModel> createAxdEntityInventTableCostModel(AxdExtTypeItemCostModel value) {
        return new JAXBElement<AxdExtTypeItemCostModel>(_AxdEntityInventTableCostModel_QNAME, AxdExtTypeItemCostModel.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdEnumProdFlushingPrincipItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "ProdFlushingPrincip", scope = AxdEntityInventTable.class)
    public JAXBElement<AxdEnumProdFlushingPrincipItem> createAxdEntityInventTableProdFlushingPrincip(AxdEnumProdFlushingPrincipItem value) {
        return new JAXBElement<AxdEnumProdFlushingPrincipItem>(_AxdEntityInventTableProdFlushingPrincip_QNAME, AxdEnumProdFlushingPrincipItem.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdExtTypeItemPurchModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "PurchModel", scope = AxdEntityInventTable.class)
    public JAXBElement<AxdExtTypeItemPurchModel> createAxdEntityInventTablePurchModel(AxdExtTypeItemPurchModel value) {
        return new JAXBElement<AxdExtTypeItemPurchModel>(_AxdEntityInventTablePurchModel_QNAME, AxdExtTypeItemPurchModel.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "BOMLevel", scope = AxdEntityInventTable.class)
    public JAXBElement<Integer> createAxdEntityInventTableBOMLevel(Integer value) {
        return new JAXBElement<Integer>(_AxdEntityInventTableBOMLevel_QNAME, Integer.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "ScrapConst", scope = AxdEntityInventTable.class)
    public JAXBElement<BigDecimal> createAxdEntityInventTableScrapConst(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AxdEntityInventTableScrapConst_QNAME, BigDecimal.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdExtTypeItemAutoReportFinished }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "AutoReportFinished", scope = AxdEntityInventTable.class)
    public JAXBElement<AxdExtTypeItemAutoReportFinished> createAxdEntityInventTableAutoReportFinished(AxdExtTypeItemAutoReportFinished value) {
        return new JAXBElement<AxdExtTypeItemAutoReportFinished>(_AxdEntityInventTableAutoReportFinished_QNAME, AxdExtTypeItemAutoReportFinished.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdEnumNoYes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "PBAItemConfigurable", scope = AxdEntityInventTable.class)
    public JAXBElement<AxdEnumNoYes> createAxdEntityInventTablePBAItemConfigurable(AxdEnumNoYes value) {
        return new JAXBElement<AxdEnumNoYes>(_AxdEntityInventTablePBAItemConfigurable_QNAME, AxdEnumNoYes.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "CommissionGroupId", scope = AxdEntityInventTable.class)
    public JAXBElement<String> createAxdEntityInventTableCommissionGroupId(String value) {
        return new JAXBElement<String>(_AxdEntityInventTableCommissionGroupId_QNAME, String.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdEnumABC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "ABCTieUp", scope = AxdEntityInventTable.class)
    public JAXBElement<AxdEnumABC> createAxdEntityInventTableABCTieUp(AxdEnumABC value) {
        return new JAXBElement<AxdEnumABC>(_AxdEntityInventTableABCTieUp_QNAME, AxdEnumABC.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "SalesPercentMarkup", scope = AxdEntityInventTable.class)
    public JAXBElement<BigDecimal> createAxdEntityInventTableSalesPercentMarkup(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AxdEntityInventTableSalesPercentMarkup_QNAME, BigDecimal.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdExtTypeItemStopExplode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "StopExplode", scope = AxdEntityInventTable.class)
    public JAXBElement<AxdExtTypeItemStopExplode> createAxdEntityInventTableStopExplode(AxdExtTypeItemStopExplode value) {
        return new JAXBElement<AxdExtTypeItemStopExplode>(_AxdEntityInventTableStopExplode_QNAME, AxdExtTypeItemStopExplode.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "CostGroupId", scope = AxdEntityInventTable.class)
    public JAXBElement<String> createAxdEntityInventTableCostGroupId(String value) {
        return new JAXBElement<String>(_AxdEntityInventTableCostGroupId_QNAME, String.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "ItemBuyerGroupId", scope = AxdEntityInventTable.class)
    public JAXBElement<String> createAxdEntityInventTableItemBuyerGroupId(String value) {
        return new JAXBElement<String>(_AxdEntityInventTableItemBuyerGroupId_QNAME, String.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "ItemPriceToleranceGroupId", scope = AxdEntityInventTable.class)
    public JAXBElement<String> createAxdEntityInventTableItemPriceToleranceGroupId(String value) {
        return new JAXBElement<String>(_AxdEntityInventTableItemPriceToleranceGroupId_QNAME, String.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdExtTypePBAHideApproval }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "PBAHideApproval", scope = AxdEntityInventTable.class)
    public JAXBElement<AxdExtTypePBAHideApproval> createAxdEntityInventTablePBAHideApproval(AxdExtTypePBAHideApproval value) {
        return new JAXBElement<AxdExtTypePBAHideApproval>(_AxdEntityInventTablePBAHideApproval_QNAME, AxdExtTypePBAHideApproval.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "bhnCompany", scope = AxdEntityInventTable.class)
    public JAXBElement<String> createAxdEntityInventTableBhnCompany(String value) {
        return new JAXBElement<String>(_AxdEntityInventTableBhnCompany_QNAME, String.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "TaxPackagingQty", scope = AxdEntityInventTable.class)
    public JAXBElement<BigDecimal> createAxdEntityInventTableTaxPackagingQty(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AxdEntityInventTableTaxPackagingQty_QNAME, BigDecimal.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdExtTypeItemBOMManualReceipt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "BOMManualReceipt", scope = AxdEntityInventTable.class)
    public JAXBElement<AxdExtTypeItemBOMManualReceipt> createAxdEntityInventTableBOMManualReceipt(AxdExtTypeItemBOMManualReceipt value) {
        return new JAXBElement<AxdExtTypeItemBOMManualReceipt>(_AxdEntityInventTableBOMManualReceipt_QNAME, AxdExtTypeItemBOMManualReceipt.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "TaraWeight", scope = AxdEntityInventTable.class)
    public JAXBElement<BigDecimal> createAxdEntityInventTableTaraWeight(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AxdEntityInventTableTaraWeight_QNAME, BigDecimal.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "projCategoryId", scope = AxdEntityInventTable.class)
    public JAXBElement<String> createAxdEntityInventTableProjCategoryId(String value) {
        return new JAXBElement<String>(_AxdEntityInventTableProjCategoryId_QNAME, String.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "PackagingGroupId", scope = AxdEntityInventTable.class)
    public JAXBElement<String> createAxdEntityInventTablePackagingGroupId(String value) {
        return new JAXBElement<String>(_AxdEntityInventTablePackagingGroupId_QNAME, String.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "BOMUnitId", scope = AxdEntityInventTable.class)
    public JAXBElement<String> createAxdEntityInventTableBOMUnitId(String value) {
        return new JAXBElement<String>(_AxdEntityInventTableBOMUnitId_QNAME, String.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "bhnSubGroup", scope = AxdEntityInventTable.class)
    public JAXBElement<String> createAxdEntityInventTableBhnSubGroup(String value) {
        return new JAXBElement<String>(_AxdEntityInventTableBhnSubGroup_QNAME, String.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "Height", scope = AxdEntityInventTable.class)
    public JAXBElement<BigDecimal> createAxdEntityInventTableHeight(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AxdEntityInventTableHeight_QNAME, BigDecimal.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "ScrapVar", scope = AxdEntityInventTable.class)
    public JAXBElement<BigDecimal> createAxdEntityInventTableScrapVar(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AxdEntityInventTableScrapVar_QNAME, BigDecimal.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "grossWidth", scope = AxdEntityInventTable.class)
    public JAXBElement<BigDecimal> createAxdEntityInventTableGrossWidth(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AxdEntityInventTableGrossWidth_QNAME, BigDecimal.class, AxdEntityInventTable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "RecVersion", scope = AxdEntityInventTableDocuRef.class)
    public JAXBElement<Integer> createAxdEntityInventTableDocuRefRecVersion(Integer value) {
        return new JAXBElement<Integer>(_AxdEntityInventItemLocationRecVersion_QNAME, Integer.class, AxdEntityInventTableDocuRef.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "Name", scope = AxdEntityInventTableDocuRef.class)
    public JAXBElement<String> createAxdEntityInventTableDocuRefName(String value) {
        return new JAXBElement<String>(_AxdEntityInventTableDocuRefName_QNAME, String.class, AxdEntityInventTableDocuRef.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "Notes", scope = AxdEntityInventTableDocuRef.class)
    public JAXBElement<String> createAxdEntityInventTableDocuRefNotes(String value) {
        return new JAXBElement<String>(_AxdEntityInventTableDocuRefNotes_QNAME, String.class, AxdEntityInventTableDocuRef.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "EncyclopediaItemId", scope = AxdEntityInventTableDocuRef.class)
    public JAXBElement<String> createAxdEntityInventTableDocuRefEncyclopediaItemId(String value) {
        return new JAXBElement<String>(_AxdEntityInventTableDocuRefEncyclopediaItemId_QNAME, String.class, AxdEntityInventTableDocuRef.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "TypeId", scope = AxdEntityInventTableDocuRef.class)
    public JAXBElement<String> createAxdEntityInventTableDocuRefTypeId(String value) {
        return new JAXBElement<String>(_AxdEntityInventTableDocuRefTypeId_QNAME, String.class, AxdEntityInventTableDocuRef.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "RefTableId", scope = AxdEntityInventTableDocuRef.class)
    public JAXBElement<Integer> createAxdEntityInventTableDocuRefRefTableId(Integer value) {
        return new JAXBElement<Integer>(_AxdEntityInventTableDocuRefRefTableId_QNAME, Integer.class, AxdEntityInventTableDocuRef.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "RefCompanyId", scope = AxdEntityInventTableDocuRef.class)
    public JAXBElement<String> createAxdEntityInventTableDocuRefRefCompanyId(String value) {
        return new JAXBElement<String>(_AxdEntityInventTableDocuRefRefCompanyId_QNAME, String.class, AxdEntityInventTableDocuRef.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "ActualCompanyId", scope = AxdEntityInventTableDocuRef.class)
    public JAXBElement<String> createAxdEntityInventTableDocuRefActualCompanyId(String value) {
        return new JAXBElement<String>(_AxdEntityInventTableDocuRefActualCompanyId_QNAME, String.class, AxdEntityInventTableDocuRef.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "PartyId", scope = AxdEntityInventTableDocuRef.class)
    public JAXBElement<String> createAxdEntityInventTableDocuRefPartyId(String value) {
        return new JAXBElement<String>(_AxdEntityInventTableDocuRefPartyId_QNAME, String.class, AxdEntityInventTableDocuRef.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdEnumBoolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "smmTable", scope = AxdEntityInventTableDocuRef.class)
    public JAXBElement<AxdEnumBoolean> createAxdEntityInventTableDocuRefSmmTable(AxdEnumBoolean value) {
        return new JAXBElement<AxdEnumBoolean>(_AxdEntityInventTableDocuRefSmmTable_QNAME, AxdEnumBoolean.class, AxdEntityInventTableDocuRef.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "AuthorId", scope = AxdEntityInventTableDocuRef.class)
    public JAXBElement<String> createAxdEntityInventTableDocuRefAuthorId(String value) {
        return new JAXBElement<String>(_AxdEntityInventTableDocuRefAuthorId_QNAME, String.class, AxdEntityInventTableDocuRef.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "RefRecId", scope = AxdEntityInventTableDocuRef.class)
    public JAXBElement<Long> createAxdEntityInventTableDocuRefRefRecId(Long value) {
        return new JAXBElement<Long>(_AxdEntityInventTableDocuRefRefRecId_QNAME, Long.class, AxdEntityInventTableDocuRef.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "ContactPersonId", scope = AxdEntityInventTableDocuRef.class)
    public JAXBElement<String> createAxdEntityInventTableDocuRefContactPersonId(String value) {
        return new JAXBElement<String>(_AxdEntityInventTableDocuRefContactPersonId_QNAME, String.class, AxdEntityInventTableDocuRef.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdEnumDocuRestriction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "Restriction", scope = AxdEntityInventTableDocuRef.class)
    public JAXBElement<AxdEnumDocuRestriction> createAxdEntityInventTableDocuRefRestriction(AxdEnumDocuRestriction value) {
        return new JAXBElement<AxdEnumDocuRestriction>(_AxdEntityInventTableDocuRefRestriction_QNAME, AxdEnumDocuRestriction.class, AxdEntityInventTableDocuRef.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "RecId", scope = AxdEntityInventTableDocuRef.class)
    public JAXBElement<Long> createAxdEntityInventTableDocuRefRecId(Long value) {
        return new JAXBElement<Long>(_AxdEntityInventItemLocationRecId_QNAME, Long.class, AxdEntityInventTableDocuRef.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "RecVersion", scope = AxdEntityPurch.class)
    public JAXBElement<Integer> createAxdEntityPurchRecVersion(Integer value) {
        return new JAXBElement<Integer>(_AxdEntityInventItemLocationRecVersion_QNAME, Integer.class, AxdEntityPurch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdEnumNoYes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "EndDisc", scope = AxdEntityPurch.class)
    public JAXBElement<AxdEnumNoYes> createAxdEntityPurchEndDisc(AxdEnumNoYes value) {
        return new JAXBElement<AxdEnumNoYes>(_AxdEntitySalesEndDisc_QNAME, AxdEnumNoYes.class, AxdEntityPurch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "PcsPrice", scope = AxdEntityPurch.class)
    public JAXBElement<BigDecimal> createAxdEntityPurchPcsPrice(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AxdEntitySalesPcsPrice_QNAME, BigDecimal.class, AxdEntityPurch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "Price", scope = AxdEntityPurch.class)
    public JAXBElement<BigDecimal> createAxdEntityPurchPrice(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AxdEntitySalesPrice_QNAME, BigDecimal.class, AxdEntityPurch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdExtTypePriceAllocateMarkup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "AllocateMarkup", scope = AxdEntityPurch.class)
    public JAXBElement<AxdExtTypePriceAllocateMarkup> createAxdEntityPurchAllocateMarkup(AxdExtTypePriceAllocateMarkup value) {
        return new JAXBElement<AxdExtTypePriceAllocateMarkup>(_AxdEntitySalesAllocateMarkup_QNAME, AxdExtTypePriceAllocateMarkup.class, AxdEntityPurch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "LineDisc", scope = AxdEntityPurch.class)
    public JAXBElement<String> createAxdEntityPurchLineDisc(String value) {
        return new JAXBElement<String>(_AxdEntitySalesLineDisc_QNAME, String.class, AxdEntityPurch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "SuppItemGroupId", scope = AxdEntityPurch.class)
    public JAXBElement<String> createAxdEntityPurchSuppItemGroupId(String value) {
        return new JAXBElement<String>(_AxdEntitySalesSuppItemGroupId_QNAME, String.class, AxdEntityPurch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "UnitId", scope = AxdEntityPurch.class)
    public JAXBElement<String> createAxdEntityPurchUnitId(String value) {
        return new JAXBElement<String>(_AxdEntitySalesUnitId_QNAME, String.class, AxdEntityPurch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "TaxItemGroupId", scope = AxdEntityPurch.class)
    public JAXBElement<String> createAxdEntityPurchTaxItemGroupId(String value) {
        return new JAXBElement<String>(_AxdEntitySalesTaxItemGroupId_QNAME, String.class, AxdEntityPurch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "UnderDeliveryPct", scope = AxdEntityPurch.class)
    public JAXBElement<BigDecimal> createAxdEntityPurchUnderDeliveryPct(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AxdEntitySalesUnderDeliveryPct_QNAME, BigDecimal.class, AxdEntityPurch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "OverDeliveryPct", scope = AxdEntityPurch.class)
    public JAXBElement<BigDecimal> createAxdEntityPurchOverDeliveryPct(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AxdEntitySalesOverDeliveryPct_QNAME, BigDecimal.class, AxdEntityPurch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "PriceDate", scope = AxdEntityPurch.class)
    public JAXBElement<XMLGregorianCalendar> createAxdEntityPurchPriceDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AxdEntitySalesPriceDate_QNAME, XMLGregorianCalendar.class, AxdEntityPurch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "Markup", scope = AxdEntityPurch.class)
    public JAXBElement<BigDecimal> createAxdEntityPurchMarkup(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AxdEntitySalesMarkup_QNAME, BigDecimal.class, AxdEntityPurch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdEnumModuleInventPurchSales }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "ModuleType", scope = AxdEntityPurch.class)
    public JAXBElement<AxdEnumModuleInventPurchSales> createAxdEntityPurchModuleType(AxdEnumModuleInventPurchSales value) {
        return new JAXBElement<AxdEnumModuleInventPurchSales>(_AxdEntitySalesModuleType_QNAME, AxdEnumModuleInventPurchSales.class, AxdEntityPurch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "RecId", scope = AxdEntityPurch.class)
    public JAXBElement<Long> createAxdEntityPurchRecId(Long value) {
        return new JAXBElement<Long>(_AxdEntityInventItemLocationRecId_QNAME, Long.class, AxdEntityPurch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "PriceQty", scope = AxdEntityPurch.class)
    public JAXBElement<BigDecimal> createAxdEntityPurchPriceQty(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AxdEntitySalesPriceQty_QNAME, BigDecimal.class, AxdEntityPurch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdExtTypeInterCompanyBlocked }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "InterCompanyBlocked", scope = AxdEntityPurch.class)
    public JAXBElement<AxdExtTypeInterCompanyBlocked> createAxdEntityPurchInterCompanyBlocked(AxdExtTypeInterCompanyBlocked value) {
        return new JAXBElement<AxdExtTypeInterCompanyBlocked>(_AxdEntitySalesInterCompanyBlocked_QNAME, AxdExtTypeInterCompanyBlocked.class, AxdEntityPurch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "MarkupGroupId", scope = AxdEntityPurch.class)
    public JAXBElement<String> createAxdEntityPurchMarkupGroupId(String value) {
        return new JAXBElement<String>(_AxdEntitySalesMarkupGroupId_QNAME, String.class, AxdEntityPurch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "PriceUnit", scope = AxdEntityPurch.class)
    public JAXBElement<BigDecimal> createAxdEntityPurchPriceUnit(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AxdEntitySalesPriceUnit_QNAME, BigDecimal.class, AxdEntityPurch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "MultiLineDisc", scope = AxdEntityPurch.class)
    public JAXBElement<String> createAxdEntityPurchMultiLineDisc(String value) {
        return new JAXBElement<String>(_AxdEntitySalesMultiLineDisc_QNAME, String.class, AxdEntityPurch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Fault", name = "CustomDetailXml", scope = AifFault.class)
    public JAXBElement<String> createAifFaultCustomDetailXml(String value) {
        return new JAXBElement<String>(_AifFaultCustomDetailXml_QNAME, String.class, AifFault.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFaultMessageList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Fault", name = "FaultMessageListArray", scope = AifFault.class)
    public JAXBElement<ArrayOfFaultMessageList> createAifFaultFaultMessageListArray(ArrayOfFaultMessageList value) {
        return new JAXBElement<ArrayOfFaultMessageList>(_AifFaultFaultMessageListArray_QNAME, ArrayOfFaultMessageList.class, AifFault.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Fault", name = "Code", scope = FaultMessage.class)
    public JAXBElement<String> createFaultMessageCode(String value) {
        return new JAXBElement<String>(_FaultMessageCode_QNAME, String.class, FaultMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Fault", name = "Message", scope = FaultMessage.class)
    public JAXBElement<String> createFaultMessageMessage(String value) {
        return new JAXBElement<String>(_FaultMessageMessage_QNAME, String.class, FaultMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdEnumXMLDocPurpose }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "DocPurpose", scope = AxdItem.class)
    public JAXBElement<AxdEnumXMLDocPurpose> createAxdItemDocPurpose(AxdEnumXMLDocPurpose value) {
        return new JAXBElement<AxdEnumXMLDocPurpose>(_AxdItemDocPurpose_QNAME, AxdEnumXMLDocPurpose.class, AxdItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "SenderId", scope = AxdItem.class)
    public JAXBElement<String> createAxdItemSenderId(String value) {
        return new JAXBElement<String>(_AxdItemSenderId_QNAME, String.class, AxdItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "RecVersion", scope = AxdEntityInventDimInventSetup.class)
    public JAXBElement<Integer> createAxdEntityInventDimInventSetupRecVersion(Integer value) {
        return new JAXBElement<Integer>(_AxdEntityInventItemLocationRecVersion_QNAME, Integer.class, AxdEntityInventDimInventSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "InventSiteId", scope = AxdEntityInventDimInventSetup.class)
    public JAXBElement<String> createAxdEntityInventDimInventSetupInventSiteId(String value) {
        return new JAXBElement<String>(_AxdEntityInventDimSalesSetupInventSiteId_QNAME, String.class, AxdEntityInventDimInventSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "inventDimId", scope = AxdEntityInventDimInventSetup.class)
    public JAXBElement<String> createAxdEntityInventDimInventSetupInventDimId(String value) {
        return new JAXBElement<String>(_AxdEntityInventItemLocationInventDimId_QNAME, String.class, AxdEntityInventDimInventSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "wMSLocationId", scope = AxdEntityInventDimInventSetup.class)
    public JAXBElement<String> createAxdEntityInventDimInventSetupWMSLocationId(String value) {
        return new JAXBElement<String>(_AxdEntityInventDimSalesSetupWMSLocationId_QNAME, String.class, AxdEntityInventDimInventSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "inventSerialId", scope = AxdEntityInventDimInventSetup.class)
    public JAXBElement<String> createAxdEntityInventDimInventSetupInventSerialId(String value) {
        return new JAXBElement<String>(_AxdEntityInventDimSalesSetupInventSerialId_QNAME, String.class, AxdEntityInventDimInventSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "RecId", scope = AxdEntityInventDimInventSetup.class)
    public JAXBElement<Long> createAxdEntityInventDimInventSetupRecId(Long value) {
        return new JAXBElement<Long>(_AxdEntityInventItemLocationRecId_QNAME, Long.class, AxdEntityInventDimInventSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "InventBatchId", scope = AxdEntityInventDimInventSetup.class)
    public JAXBElement<String> createAxdEntityInventDimInventSetupInventBatchId(String value) {
        return new JAXBElement<String>(_AxdEntityInventDimSalesSetupInventBatchId_QNAME, String.class, AxdEntityInventDimInventSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "InventLocationId", scope = AxdEntityInventDimInventSetup.class)
    public JAXBElement<String> createAxdEntityInventDimInventSetupInventLocationId(String value) {
        return new JAXBElement<String>(_AxdEntityInventDimSalesSetupInventLocationId_QNAME, String.class, AxdEntityInventDimInventSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "RecVersion", scope = AxdEntityInvent.class)
    public JAXBElement<Integer> createAxdEntityInventRecVersion(Integer value) {
        return new JAXBElement<Integer>(_AxdEntityInventItemLocationRecVersion_QNAME, Integer.class, AxdEntityInvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdEnumNoYes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "EndDisc", scope = AxdEntityInvent.class)
    public JAXBElement<AxdEnumNoYes> createAxdEntityInventEndDisc(AxdEnumNoYes value) {
        return new JAXBElement<AxdEnumNoYes>(_AxdEntitySalesEndDisc_QNAME, AxdEnumNoYes.class, AxdEntityInvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "PcsPrice", scope = AxdEntityInvent.class)
    public JAXBElement<BigDecimal> createAxdEntityInventPcsPrice(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AxdEntitySalesPcsPrice_QNAME, BigDecimal.class, AxdEntityInvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "Price", scope = AxdEntityInvent.class)
    public JAXBElement<BigDecimal> createAxdEntityInventPrice(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AxdEntitySalesPrice_QNAME, BigDecimal.class, AxdEntityInvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdExtTypePriceAllocateMarkup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "AllocateMarkup", scope = AxdEntityInvent.class)
    public JAXBElement<AxdExtTypePriceAllocateMarkup> createAxdEntityInventAllocateMarkup(AxdExtTypePriceAllocateMarkup value) {
        return new JAXBElement<AxdExtTypePriceAllocateMarkup>(_AxdEntitySalesAllocateMarkup_QNAME, AxdExtTypePriceAllocateMarkup.class, AxdEntityInvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "LineDisc", scope = AxdEntityInvent.class)
    public JAXBElement<String> createAxdEntityInventLineDisc(String value) {
        return new JAXBElement<String>(_AxdEntitySalesLineDisc_QNAME, String.class, AxdEntityInvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "SuppItemGroupId", scope = AxdEntityInvent.class)
    public JAXBElement<String> createAxdEntityInventSuppItemGroupId(String value) {
        return new JAXBElement<String>(_AxdEntitySalesSuppItemGroupId_QNAME, String.class, AxdEntityInvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "UnitId", scope = AxdEntityInvent.class)
    public JAXBElement<String> createAxdEntityInventUnitId(String value) {
        return new JAXBElement<String>(_AxdEntitySalesUnitId_QNAME, String.class, AxdEntityInvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "TaxItemGroupId", scope = AxdEntityInvent.class)
    public JAXBElement<String> createAxdEntityInventTaxItemGroupId(String value) {
        return new JAXBElement<String>(_AxdEntitySalesTaxItemGroupId_QNAME, String.class, AxdEntityInvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "UnderDeliveryPct", scope = AxdEntityInvent.class)
    public JAXBElement<BigDecimal> createAxdEntityInventUnderDeliveryPct(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AxdEntitySalesUnderDeliveryPct_QNAME, BigDecimal.class, AxdEntityInvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "OverDeliveryPct", scope = AxdEntityInvent.class)
    public JAXBElement<BigDecimal> createAxdEntityInventOverDeliveryPct(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AxdEntitySalesOverDeliveryPct_QNAME, BigDecimal.class, AxdEntityInvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "PriceDate", scope = AxdEntityInvent.class)
    public JAXBElement<XMLGregorianCalendar> createAxdEntityInventPriceDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AxdEntitySalesPriceDate_QNAME, XMLGregorianCalendar.class, AxdEntityInvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "Markup", scope = AxdEntityInvent.class)
    public JAXBElement<BigDecimal> createAxdEntityInventMarkup(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AxdEntitySalesMarkup_QNAME, BigDecimal.class, AxdEntityInvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdEnumModuleInventPurchSales }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "ModuleType", scope = AxdEntityInvent.class)
    public JAXBElement<AxdEnumModuleInventPurchSales> createAxdEntityInventModuleType(AxdEnumModuleInventPurchSales value) {
        return new JAXBElement<AxdEnumModuleInventPurchSales>(_AxdEntitySalesModuleType_QNAME, AxdEnumModuleInventPurchSales.class, AxdEntityInvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "RecId", scope = AxdEntityInvent.class)
    public JAXBElement<Long> createAxdEntityInventRecId(Long value) {
        return new JAXBElement<Long>(_AxdEntityInventItemLocationRecId_QNAME, Long.class, AxdEntityInvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "PriceQty", scope = AxdEntityInvent.class)
    public JAXBElement<BigDecimal> createAxdEntityInventPriceQty(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AxdEntitySalesPriceQty_QNAME, BigDecimal.class, AxdEntityInvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdExtTypeInterCompanyBlocked }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "InterCompanyBlocked", scope = AxdEntityInvent.class)
    public JAXBElement<AxdExtTypeInterCompanyBlocked> createAxdEntityInventInterCompanyBlocked(AxdExtTypeInterCompanyBlocked value) {
        return new JAXBElement<AxdExtTypeInterCompanyBlocked>(_AxdEntitySalesInterCompanyBlocked_QNAME, AxdExtTypeInterCompanyBlocked.class, AxdEntityInvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "MarkupGroupId", scope = AxdEntityInvent.class)
    public JAXBElement<String> createAxdEntityInventMarkupGroupId(String value) {
        return new JAXBElement<String>(_AxdEntitySalesMarkupGroupId_QNAME, String.class, AxdEntityInvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "PriceUnit", scope = AxdEntityInvent.class)
    public JAXBElement<BigDecimal> createAxdEntityInventPriceUnit(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AxdEntitySalesPriceUnit_QNAME, BigDecimal.class, AxdEntityInvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "MultiLineDisc", scope = AxdEntityInvent.class)
    public JAXBElement<String> createAxdEntityInventMultiLineDisc(String value) {
        return new JAXBElement<String>(_AxdEntitySalesMultiLineDisc_QNAME, String.class, AxdEntityInvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "RecVersion", scope = AxdEntityDefaultInventDimInventSetup.class)
    public JAXBElement<Integer> createAxdEntityDefaultInventDimInventSetupRecVersion(Integer value) {
        return new JAXBElement<Integer>(_AxdEntityInventItemLocationRecVersion_QNAME, Integer.class, AxdEntityDefaultInventDimInventSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "InventSiteId", scope = AxdEntityDefaultInventDimInventSetup.class)
    public JAXBElement<String> createAxdEntityDefaultInventDimInventSetupInventSiteId(String value) {
        return new JAXBElement<String>(_AxdEntityInventDimSalesSetupInventSiteId_QNAME, String.class, AxdEntityDefaultInventDimInventSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "inventDimId", scope = AxdEntityDefaultInventDimInventSetup.class)
    public JAXBElement<String> createAxdEntityDefaultInventDimInventSetupInventDimId(String value) {
        return new JAXBElement<String>(_AxdEntityInventItemLocationInventDimId_QNAME, String.class, AxdEntityDefaultInventDimInventSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "wMSLocationId", scope = AxdEntityDefaultInventDimInventSetup.class)
    public JAXBElement<String> createAxdEntityDefaultInventDimInventSetupWMSLocationId(String value) {
        return new JAXBElement<String>(_AxdEntityInventDimSalesSetupWMSLocationId_QNAME, String.class, AxdEntityDefaultInventDimInventSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "inventSerialId", scope = AxdEntityDefaultInventDimInventSetup.class)
    public JAXBElement<String> createAxdEntityDefaultInventDimInventSetupInventSerialId(String value) {
        return new JAXBElement<String>(_AxdEntityInventDimSalesSetupInventSerialId_QNAME, String.class, AxdEntityDefaultInventDimInventSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "RecId", scope = AxdEntityDefaultInventDimInventSetup.class)
    public JAXBElement<Long> createAxdEntityDefaultInventDimInventSetupRecId(Long value) {
        return new JAXBElement<Long>(_AxdEntityInventItemLocationRecId_QNAME, Long.class, AxdEntityDefaultInventDimInventSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "InventBatchId", scope = AxdEntityDefaultInventDimInventSetup.class)
    public JAXBElement<String> createAxdEntityDefaultInventDimInventSetupInventBatchId(String value) {
        return new JAXBElement<String>(_AxdEntityInventDimSalesSetupInventBatchId_QNAME, String.class, AxdEntityDefaultInventDimInventSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "InventLocationId", scope = AxdEntityDefaultInventDimInventSetup.class)
    public JAXBElement<String> createAxdEntityDefaultInventDimInventSetupInventLocationId(String value) {
        return new JAXBElement<String>(_AxdEntityInventDimSalesSetupInventLocationId_QNAME, String.class, AxdEntityDefaultInventDimInventSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "RecVersion", scope = AxdEntityInventDimPurchSetup.class)
    public JAXBElement<Integer> createAxdEntityInventDimPurchSetupRecVersion(Integer value) {
        return new JAXBElement<Integer>(_AxdEntityInventItemLocationRecVersion_QNAME, Integer.class, AxdEntityInventDimPurchSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "InventSiteId", scope = AxdEntityInventDimPurchSetup.class)
    public JAXBElement<String> createAxdEntityInventDimPurchSetupInventSiteId(String value) {
        return new JAXBElement<String>(_AxdEntityInventDimSalesSetupInventSiteId_QNAME, String.class, AxdEntityInventDimPurchSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "inventDimId", scope = AxdEntityInventDimPurchSetup.class)
    public JAXBElement<String> createAxdEntityInventDimPurchSetupInventDimId(String value) {
        return new JAXBElement<String>(_AxdEntityInventItemLocationInventDimId_QNAME, String.class, AxdEntityInventDimPurchSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "wMSLocationId", scope = AxdEntityInventDimPurchSetup.class)
    public JAXBElement<String> createAxdEntityInventDimPurchSetupWMSLocationId(String value) {
        return new JAXBElement<String>(_AxdEntityInventDimSalesSetupWMSLocationId_QNAME, String.class, AxdEntityInventDimPurchSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "inventSerialId", scope = AxdEntityInventDimPurchSetup.class)
    public JAXBElement<String> createAxdEntityInventDimPurchSetupInventSerialId(String value) {
        return new JAXBElement<String>(_AxdEntityInventDimSalesSetupInventSerialId_QNAME, String.class, AxdEntityInventDimPurchSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "RecId", scope = AxdEntityInventDimPurchSetup.class)
    public JAXBElement<Long> createAxdEntityInventDimPurchSetupRecId(Long value) {
        return new JAXBElement<Long>(_AxdEntityInventItemLocationRecId_QNAME, Long.class, AxdEntityInventDimPurchSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "InventBatchId", scope = AxdEntityInventDimPurchSetup.class)
    public JAXBElement<String> createAxdEntityInventDimPurchSetupInventBatchId(String value) {
        return new JAXBElement<String>(_AxdEntityInventDimSalesSetupInventBatchId_QNAME, String.class, AxdEntityInventDimPurchSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "InventLocationId", scope = AxdEntityInventDimPurchSetup.class)
    public JAXBElement<String> createAxdEntityInventDimPurchSetupInventLocationId(String value) {
        return new JAXBElement<String>(_AxdEntityInventDimSalesSetupInventLocationId_QNAME, String.class, AxdEntityInventDimPurchSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "RecVersion", scope = AxdEntityInventTxt.class)
    public JAXBElement<Integer> createAxdEntityInventTxtRecVersion(Integer value) {
        return new JAXBElement<Integer>(_AxdEntityInventItemLocationRecVersion_QNAME, Integer.class, AxdEntityInventTxt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "ItemId", scope = AxdEntityInventTxt.class)
    public JAXBElement<String> createAxdEntityInventTxtItemId(String value) {
        return new JAXBElement<String>(_AxdEntityInventTableItemId_QNAME, String.class, AxdEntityInventTxt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "InventDimId", scope = AxdEntityInventTxt.class)
    public JAXBElement<String> createAxdEntityInventTxtInventDimId(String value) {
        return new JAXBElement<String>(_AxdEntityInventItemSalesSetupInventDimId_QNAME, String.class, AxdEntityInventTxt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "Txt", scope = AxdEntityInventTxt.class)
    public JAXBElement<String> createAxdEntityInventTxtTxt(String value) {
        return new JAXBElement<String>(_AxdEntityInventTxtTxt_QNAME, String.class, AxdEntityInventTxt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "RecId", scope = AxdEntityInventTxt.class)
    public JAXBElement<Long> createAxdEntityInventTxtRecId(Long value) {
        return new JAXBElement<Long>(_AxdEntityInventItemLocationRecId_QNAME, Long.class, AxdEntityInventTxt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "RecVersion", scope = AxdEntityDefaultInventDimSalesSetup.class)
    public JAXBElement<Integer> createAxdEntityDefaultInventDimSalesSetupRecVersion(Integer value) {
        return new JAXBElement<Integer>(_AxdEntityInventItemLocationRecVersion_QNAME, Integer.class, AxdEntityDefaultInventDimSalesSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "InventSiteId", scope = AxdEntityDefaultInventDimSalesSetup.class)
    public JAXBElement<String> createAxdEntityDefaultInventDimSalesSetupInventSiteId(String value) {
        return new JAXBElement<String>(_AxdEntityInventDimSalesSetupInventSiteId_QNAME, String.class, AxdEntityDefaultInventDimSalesSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "inventDimId", scope = AxdEntityDefaultInventDimSalesSetup.class)
    public JAXBElement<String> createAxdEntityDefaultInventDimSalesSetupInventDimId(String value) {
        return new JAXBElement<String>(_AxdEntityInventItemLocationInventDimId_QNAME, String.class, AxdEntityDefaultInventDimSalesSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "wMSLocationId", scope = AxdEntityDefaultInventDimSalesSetup.class)
    public JAXBElement<String> createAxdEntityDefaultInventDimSalesSetupWMSLocationId(String value) {
        return new JAXBElement<String>(_AxdEntityInventDimSalesSetupWMSLocationId_QNAME, String.class, AxdEntityDefaultInventDimSalesSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "inventSerialId", scope = AxdEntityDefaultInventDimSalesSetup.class)
    public JAXBElement<String> createAxdEntityDefaultInventDimSalesSetupInventSerialId(String value) {
        return new JAXBElement<String>(_AxdEntityInventDimSalesSetupInventSerialId_QNAME, String.class, AxdEntityDefaultInventDimSalesSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "RecId", scope = AxdEntityDefaultInventDimSalesSetup.class)
    public JAXBElement<Long> createAxdEntityDefaultInventDimSalesSetupRecId(Long value) {
        return new JAXBElement<Long>(_AxdEntityInventItemLocationRecId_QNAME, Long.class, AxdEntityDefaultInventDimSalesSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "InventBatchId", scope = AxdEntityDefaultInventDimSalesSetup.class)
    public JAXBElement<String> createAxdEntityDefaultInventDimSalesSetupInventBatchId(String value) {
        return new JAXBElement<String>(_AxdEntityInventDimSalesSetupInventBatchId_QNAME, String.class, AxdEntityDefaultInventDimSalesSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "InventLocationId", scope = AxdEntityDefaultInventDimSalesSetup.class)
    public JAXBElement<String> createAxdEntityDefaultInventDimSalesSetupInventLocationId(String value) {
        return new JAXBElement<String>(_AxdEntityInventDimSalesSetupInventLocationId_QNAME, String.class, AxdEntityDefaultInventDimSalesSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "RecVersion", scope = AxdEntityInventItemInventSetup.class)
    public JAXBElement<Integer> createAxdEntityInventItemInventSetupRecVersion(Integer value) {
        return new JAXBElement<Integer>(_AxdEntityInventItemLocationRecVersion_QNAME, Integer.class, AxdEntityInventItemInventSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdExtTypeItemStopped }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "Stopped", scope = AxdEntityInventItemInventSetup.class)
    public JAXBElement<AxdExtTypeItemStopped> createAxdEntityInventItemInventSetupStopped(AxdExtTypeItemStopped value) {
        return new JAXBElement<AxdExtTypeItemStopped>(_AxdEntityInventItemSalesSetupStopped_QNAME, AxdExtTypeItemStopped.class, AxdEntityInventItemInventSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "HighestQty", scope = AxdEntityInventItemInventSetup.class)
    public JAXBElement<BigDecimal> createAxdEntityInventItemInventSetupHighestQty(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AxdEntityInventItemSalesSetupHighestQty_QNAME, BigDecimal.class, AxdEntityInventItemInventSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdEnumSalesDeliveryDateControlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "DeliveryDateControlType", scope = AxdEntityInventItemInventSetup.class)
    public JAXBElement<AxdEnumSalesDeliveryDateControlType> createAxdEntityInventItemInventSetupDeliveryDateControlType(AxdEnumSalesDeliveryDateControlType value) {
        return new JAXBElement<AxdEnumSalesDeliveryDateControlType>(_AxdEntityInventItemSalesSetupDeliveryDateControlType_QNAME, AxdEnumSalesDeliveryDateControlType.class, AxdEntityInventItemInventSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "InventDimId", scope = AxdEntityInventItemInventSetup.class)
    public JAXBElement<String> createAxdEntityInventItemInventSetupInventDimId(String value) {
        return new JAXBElement<String>(_AxdEntityInventItemSalesSetupInventDimId_QNAME, String.class, AxdEntityInventItemInventSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdExtTypeCalendarDays }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "CalendarDays", scope = AxdEntityInventItemInventSetup.class)
    public JAXBElement<AxdExtTypeCalendarDays> createAxdEntityInventItemInventSetupCalendarDays(AxdExtTypeCalendarDays value) {
        return new JAXBElement<AxdExtTypeCalendarDays>(_AxdEntityInventItemPurchSetupCalendarDays_QNAME, AxdExtTypeCalendarDays.class, AxdEntityInventItemInventSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdExtTypeNoYesId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "Override", scope = AxdEntityInventItemInventSetup.class)
    public JAXBElement<AxdExtTypeNoYesId> createAxdEntityInventItemInventSetupOverride(AxdExtTypeNoYesId value) {
        return new JAXBElement<AxdExtTypeNoYesId>(_AxdEntityInventItemSalesSetupOverride_QNAME, AxdExtTypeNoYesId.class, AxdEntityInventItemInventSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "MultipleQty", scope = AxdEntityInventItemInventSetup.class)
    public JAXBElement<BigDecimal> createAxdEntityInventItemInventSetupMultipleQty(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AxdEntityInventItemSalesSetupMultipleQty_QNAME, BigDecimal.class, AxdEntityInventItemInventSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "ATPTimeFence", scope = AxdEntityInventItemInventSetup.class)
    public JAXBElement<Integer> createAxdEntityInventItemInventSetupATPTimeFence(Integer value) {
        return new JAXBElement<Integer>(_AxdEntityInventItemSalesSetupATPTimeFence_QNAME, Integer.class, AxdEntityInventItemInventSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "StandardQty", scope = AxdEntityInventItemInventSetup.class)
    public JAXBElement<BigDecimal> createAxdEntityInventItemInventSetupStandardQty(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AxdEntityInventItemSalesSetupStandardQty_QNAME, BigDecimal.class, AxdEntityInventItemInventSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "LeadTime", scope = AxdEntityInventItemInventSetup.class)
    public JAXBElement<Integer> createAxdEntityInventItemInventSetupLeadTime(Integer value) {
        return new JAXBElement<Integer>(_AxdEntityInventItemSalesSetupLeadTime_QNAME, Integer.class, AxdEntityInventItemInventSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdExtTypeSalesATPInclPlannedOrders }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "ATPInclPlannedOrders", scope = AxdEntityInventItemInventSetup.class)
    public JAXBElement<AxdExtTypeSalesATPInclPlannedOrders> createAxdEntityInventItemInventSetupATPInclPlannedOrders(AxdExtTypeSalesATPInclPlannedOrders value) {
        return new JAXBElement<AxdExtTypeSalesATPInclPlannedOrders>(_AxdEntityInventItemSalesSetupATPInclPlannedOrders_QNAME, AxdExtTypeSalesATPInclPlannedOrders.class, AxdEntityInventItemInventSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdExtTypeNoYesId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "MandatoryInventSite", scope = AxdEntityInventItemInventSetup.class)
    public JAXBElement<AxdExtTypeNoYesId> createAxdEntityInventItemInventSetupMandatoryInventSite(AxdExtTypeNoYesId value) {
        return new JAXBElement<AxdExtTypeNoYesId>(_AxdEntityInventItemSalesSetupMandatoryInventSite_QNAME, AxdExtTypeNoYesId.class, AxdEntityInventItemInventSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "RecId", scope = AxdEntityInventItemInventSetup.class)
    public JAXBElement<Long> createAxdEntityInventItemInventSetupRecId(Long value) {
        return new JAXBElement<Long>(_AxdEntityInventItemLocationRecId_QNAME, Long.class, AxdEntityInventItemInventSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxdExtTypeNoYesId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "MandatoryInventLocation", scope = AxdEntityInventItemInventSetup.class)
    public JAXBElement<AxdExtTypeNoYesId> createAxdEntityInventItemInventSetupMandatoryInventLocation(AxdExtTypeNoYesId value) {
        return new JAXBElement<AxdExtTypeNoYesId>(_AxdEntityInventItemSalesSetupMandatoryInventLocation_QNAME, AxdExtTypeNoYesId.class, AxdEntityInventItemInventSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "InventDimIdDefault", scope = AxdEntityInventItemInventSetup.class)
    public JAXBElement<String> createAxdEntityInventItemInventSetupInventDimIdDefault(String value) {
        return new JAXBElement<String>(_AxdEntityInventItemSalesSetupInventDimIdDefault_QNAME, String.class, AxdEntityInventItemInventSetup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", name = "LowestQty", scope = AxdEntityInventItemInventSetup.class)
    public JAXBElement<BigDecimal> createAxdEntityInventItemInventSetupLowestQty(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AxdEntityInventItemSalesSetupLowestQty_QNAME, BigDecimal.class, AxdEntityInventItemInventSetup.class, value);
    }

}
