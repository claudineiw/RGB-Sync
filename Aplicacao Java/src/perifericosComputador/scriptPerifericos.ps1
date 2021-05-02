CLS
'['
$retorno=Get-WmiObject Win32_PnPSignedDriver| select DeviceName ,HardWareID,DeviceProviderName| where {$_.DeviceName -like "*Logitech*"}
for($i=0;$i -le $retorno.Length-1;$i++)
{
'{'
'"DeviceName":"'+$retorno.GetValue($i).DeviceName +'",'
'"HardWareID":"'+$retorno.GetValue($i).HardWareID+'",' 
'"DeviceProviderName":"'+$retorno.GetValue($i).DeviceProviderName+'"'
'}'
 if($i -le $retorno.Length-2){
    ','
   }

  
}
']'

 