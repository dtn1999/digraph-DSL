<#assign scalars = ast.getScalarList()>
<#assign types = ast.getTypeList()>

/** All built-in and custom scalars, mapped to their actual values */
export type Scalars = {
 ID: string;
 String: string;
 Boolean: boolean;
 Int: number;
 Float: number;
<#list scalars as scalar>
 <#assign name = scalar.getName()>
 ${name?uncap_first}: any;
</#list>
};

/** All available types */
<#list types as type>
 <#assign name = type.getName()>
 <#assign attributes = type.getAttributesList()>
export type ${name?cap_first} = {
 <#list attributes as attribute>
  <#assign attrName = attribute.getAttributeName()>
  <#assign attrType = attribute.getAttributeType()>
  <#assign isCollection = attribute.isCollection()>
  <#assign isBuildInScalar = attribute.isBuildInScalar()>
  ${attrName?lower_case}: <#if isBuildInScalar><#if isCollection>Array< Scalars["${attrType}"] ><#else>Scalars["${attrType}"]</#if><#else><#if isCollection>Array<${attrType}><#else>${attrType}</#if></#if>;
 </#list>
}
</#list>
