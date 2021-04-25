CLS
'['
$retorno=Get-WmiObject Win32_PnPSignedDriver| select DeviceName, DriverVersion, Manufacturer,HardWareID,DeviceProviderName,DeviceID,Description 
for($i=0;$i -le $retorno.Length-1;$i++)
{
'{'
'"DeviceName":"'+$retorno.GetValue($i).DeviceName +'",'
'"DriverVersion":"'+$retorno.GetValue($i).DriverVersion+'",'
'"Manufacturer":"'+$retorno.GetValue($i).Manufacturer+'",'
'"HardWareID":"'+$retorno.GetValue($i).HardWareID+'",' 
'"DeviceProviderName":"'+$retorno.GetValue($i).DeviceProviderName+'",'
'"DeviceID":"'+$retorno.GetValue($i).DeviceID+'",'
'"Description":"'+$retorno.GetValue($i).Description+'"' 
'}'

   if($i -le $retorno.Length-2){
    ','
   }
}
']'