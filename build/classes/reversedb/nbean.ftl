<#ftl strip_whitespace = true>
<#assign charset="UTF-8">
<#assign title="Example">
package org.tlamatini.modelo;

import lombok.Data;

@Data
public class ${entidad} {

// llave primaria
<#list  pks as pk>
 Object ${pk};
</#list>

// columnas
<#list  cols as col>
 Object ${col};
</#list>

}