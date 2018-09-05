For ($i=501; $i -le 1000; $i++)            
{  
	$UserFirstname = "EndUser_OP001_"            
    $UserLastname = "$i"   
	
    $UPN = $UserFirstname + $UserLastname + "@ciscoctg.com"                  
    $Password = "C1sco123="
	
	$SAM = $UserFirstname + $UserLastname
	
    New-ADUser -Name $SAM -DisplayName $SAM -SamAccountName $SAM -UserPrincipalName $UPN -GivenName "$UserFirstname" -Surname "$UserLastname"  -AccountPassword (ConvertTo-SecureString $Password -AsPlainText -Force) -Enabled $true -ChangePasswordAtLogon $false -PasswordNeverExpires $true          
}