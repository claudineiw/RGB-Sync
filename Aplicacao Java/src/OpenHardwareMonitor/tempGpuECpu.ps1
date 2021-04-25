CLS 
Add-Type -Path "C:\windows\system32\OpenHardwareMonitorLib.dll"
 
$Comp = New-Object -TypeName OpenHardwareMonitor.Hardware.Computer
 
$Comp.Open()
 
$Comp.CPUEnabled = $true
 
#$Comp.RAMEnabled = $true
 
#$Comp.MainboardEnabled = $true
 
#$Comp.FanControllerEnabled = $true
 
$Comp.GPUEnabled = $true
 
#$Comp.HDDEnabled = $true
'['
ForEach ($HW in $Comp.Hardware) { 
$HW.Update()   
 If ($hw.HardwareType -eq "CPU"){
        '{'
        ForEach ($Sensor in $HW.Sensors) { 
        If ($Sensor.SensorType -eq "Temperature"){
		if($Sensor.Name.equals("CPU Package")){
                 '"Tipo":"'+$hw.HardwareType.ToString()+'",'
                 '"Nome":"'+$hw.name.ToString()+'",'
                 '"Temp":'+$Sensor.Value.ToString()+''
	}
        }
      }
      '}'
    }  
 If ($hw.HardwareType -eq "GpuAti"){
        ','
        '{'
        ForEach ($Sensor in $HW.Sensors) { 
        If ($Sensor.SensorType -eq "Temperature"){
            '"Tipo":"'+$hw.HardwareType.ToString()+'",'
            '"Nome":"'+$hw.name.ToString()+'",'
            '"Temp":'+$Sensor.Value.ToString()+''
        }
      }
      '}'
    }

 If ($hw.HardwareType -eq "GpuNvidia"){
        ','
        '{'
        ForEach ($Sensor in $HW.Sensors) { 
         If ($Sensor.SensorType -eq "Temperature"){
            '"Tipo":"'+$hw.HardwareType.ToString()+'",'
            '"Nome":"'+$hw.name.ToString()+'",'
            '"Temp":'+$Sensor.Value.ToString()+''
        }
      }
    '}'
    }

   
}
']'  
$Comp.Close()