import java.io.FileWriter;

public class FeatureWriter {
	
	public final static int START = 3001;
	public final static int END = 4000;

	public static void initital(FileWriter fw) throws Exception {
		fw.write("import citg.common.PhoneHelperLib.YamlUtils as utility" + "\nimport os"
				+ "\n\nUCM2_PUB_ip = utility.readttsfile('UCM2-PUB','ip');\r\n"
				+ "UCM2_SUB_1A_ip = utility.readttsfile('UCM2-SUB-1A','ip');\r\n" + "\r\n"
				+ "UCM2_PUB_username = utility.readttsfile('UCM2-PUB','username');\r\n" + "\r\n"
				+ "UCM2_PUB_password = utility.readttsfile('UCM2-PUB','password');\r\n" + "\r\n"
				+ "UCM2_PUB_server = \"CM_\" + utility.readttsfile('UCM2-PUB','server');\r\n"
				+ "UCM2_SUB_1A_server = \"CM_\" + utility.readttsfile('UCM2-SUB-1A','server');\r\n" + "\r\n"
				+ "UCM2_PUB_servername = utility.readttsfile('UCM2-PUB','server');\r\n"
				+ "UCM2_SUB_1A_servername = utility.readttsfile('UCM2-SUB-1A','server');\r\n" + "\r\n"
				+ "UCM2_domain = utility.readttsfile('UCM2-PUB','domain');\r\n" + "\r\n"
				+ "REMOTE_CAM3_F_6A_ipv4=utility.readttsfile('REMOTE-CAM3-F-6A','ip')\r\n"
				+ "REMOTE_CAM3_F_6A_ipv6=utility.readttsfile('REMOTE-CAM3-F-6A','ipv6')");

	}

	public static void writeTitle(FileWriter fw, String title) throws Exception {
		fw.write("\r\n\n" + "########################################################\r\n" + "## " + title + "\r\n"
				+ "########################################################");
	}

	public static void writePhoneParams(FileWriter fw)throws Exception {
		writeTitle(fw, "Phone Params");
		for(int i=START; i<=END; i++) {
			fw.write("\nsip_phone1_A" +i+ "_UCM2_PUB_Sec_v4_param = {}");
		}
	}

	public static void writeMacAddress(FileWriter fw) throws Exception {
		writeTitle(fw, "Mac Address");
		for (int i=START; i<=END; i++) {
			fw.write("\nsip_phone_A" +i+ "_UCM2_PUB_Sec_v4_name = 'CSFOP001" +i+ "'");
		}
	}
	
	public static void writeDNs(FileWriter fw) throws Exception {
		writeTitle(fw, "DNs");
		for (int i=START; i<=END; i++) {
			fw.write("\nDN_" +i+ " = '" +(i+1000)+ "'");
		}
	}
	
	public static void writePhoneLines(FileWriter fw) throws Exception {
		writeTitle(fw, "Phone Lines");
		for (int i=START; i<=END; i++) {
			fw.write("\nphoneLine_" +i+ " = {\r\n" + 
					"        \"number\" : DN_" +i+ ",\r\n" + 
					"        \"route_partition_name\" : None,\r\n" + 
					"        \"usage\" : 'Device',\r\n" + 
					"        \"new_pattern\" : None,\r\n" + 
					"        \"description\" : DN_" +i+ "\r\n" + 
					"        }");
		}
	}
	
	public static void writePhoneParameters(FileWriter fw) throws Exception {
		writeTitle(fw, "Phone Parameters");
		for (int i=START; i<=END; i++) {
			fw.write("\n" +
					"sip_phone1_A"+i+"_UCM2_PUB_Sec_v4_param['sip.phone.sso.ucmlogin']= 1\r\n" + 
					"sip_phone1_A"+i+"_UCM2_PUB_Sec_v4_param['sip.phone.tls1dot2']= 2\r\n" + 
					"sip_phone1_A"+i+"_UCM2_PUB_Sec_v4_param['sip.phone.deviceid']= '38'\r\n" + 
					"sip_phone1_A"+i+"_UCM2_PUB_Sec_v4_param['sip.phone.uds.centraludsip']=\"10.5.10.50\"\r\n" + 
					"sip_phone1_A"+i+"_UCM2_PUB_Sec_v4_param['sip.phone.username'] = \"EndUser_OP001_" +i+ "\"\r\n" + 
					"sip_phone1_A"+i+"_UCM2_PUB_Sec_v4_param['sip.phone.password'] = \"C1sco123=\"\r\n" + 
					"sip_phone1_A"+i+"_UCM2_PUB_Sec_v4_param['sip.phone.domain'] = \"ciscoctg.com\"\r\n" + 
					"sip_phone1_A"+i+"_UCM2_PUB_Sec_v4_param['sip.phone.http.enabled'] = 1\r\n" + 
					"sip_phone1_A"+i+"_UCM2_PUB_Sec_v4_param['sip.phone.transport'] = 1\r\n" + 
					"sip_phone1_A"+i+"_UCM2_PUB_Sec_v4_param['sip.phone.servicecontrol.resetregistertimer']=10000\r\n" + 
					"sip_phone1_A"+i+"_UCM2_PUB_Sec_v4_param['sip.phone.notifyccmresettimer']=5000\r\n" + 
					"sip_phone1_A"+i+"_UCM2_PUB_Sec_v4_param['sip.phone.httpip']='10.12.10.11'\r\n" + 
					"sip_phone1_A"+i+"_UCM2_PUB_Sec_v4_param['sip.phone.sso.clientid']='C1b4b988f3efa1c3fc97d0d0a36f6b97f244b4fafe55e8d9d78774e305bae9ab1'\r\n" + 
					"sip_phone1_A"+i+"_UCM2_PUB_Sec_v4_param['sip.phone.secured'] = 2\r\n" + 
					"sip_phone1_A"+i+"_UCM2_PUB_Sec_v4_param['sip.phone.certfile'] = \"/usr/local/camelot/lib/certificates/CSFOP001"+i+".cer\"\r\n" + 
					"sip_phone1_A"+i+"_UCM2_PUB_Sec_v4_param['sip.phone.keyfile'] = \"/usr/local/camelot/lib/clientkeys/CSFOP001"+i+".pem\"\r\n" + 
					"sip_phone1_A"+i+"_UCM2_PUB_Sec_v4_param['sip.phone.certificate.reuse'] = 1" +
					"\n\n");
		}
	}
	
	public static void writePhoneSecurityProfile(FileWriter fw) throws Exception {
		writeTitle(fw, "Phone Security Profile");
		fw.write("\nPhoneSecurityProfile_CSF_Enc = {\r\n" + 
				"     \"name\": \"CSFSipOAuthDisabled\",\r\n" + 
				"     \"phoneType\": \"Cisco Unified Client Services Framework\",\r\n" + 
				"     \"protocol\": 'SIP',\r\n" + 
				"     \"transport_type\": 'TLS',\r\n" + 
				"     \"security_mode\": 'Encrypted',\r\n" + 
				"     \"sipoauthflag\": 'False'\r\n" + 
				"}\r\n\n");
	}
	
	public static void writePhone(FileWriter fw) throws Exception {
		writeTitle(fw, "Phone Lines");
		for (int i=START; i<=END; i++) {
			fw.write("\nPhone_sip_phone_A" +i+ "_UCM2_PUB_Sec_v4 = {\n" +
				"    \"CUCM\": \"UCM2_PUB\",\r\n" + 
				"    \"phone_type\": 'Cisco Unified Client Services Framework',\r\n" + 
				"    \"mac_address\": sip_phone_A"+i+"_UCM2_PUB_Sec_v4_name,\r\n" + 
				"    \"phone_number\": phoneLine_"+i+"['number'],\r\n" + 
				"    \"product\": \"Cisco Unified Client Services Framework\",\r\n" + 
				"    \"protocol\" : 'SIP',\r\n" + 
				"    \"owner_username\": \"EndUser_OP001_"+i+"\",\r\n" + 
				"    \"soft_key_template_name\": \"Standard User\",\r\n" + 
				"    \"security_profile\": PhoneSecurityProfile_CSF_Enc,\r\n" + 
				"    \"phone_param\" : sip_phone1_A"+i+"_UCM2_PUB_Sec_v4_param}\n\n");
		}
	}
	
	public static void writeConfigurationList(FileWriter fw) throws Exception {
		writeTitle(fw, "Configuration List");
		fw.write("\nconfiguration_list = {\r\n" + 
				"       \"UCM2-PUB\" : {\r\n" + 
				"                 \"PhoneLine\" :[");
		for(int i=START; i<=END; i++) {
			 fw.write("phoneLine_" + i);
			 if(i!=END)
				 fw.write(",");
		}
		fw.write("],\r\n" + 
				"                 \"PhoneSecurityProfile\" : [PhoneSecurityProfile_CSF_Enc],\r\n" + 
				"                 \"Phone\" : [");
		for(int i=START; i<=END; i++) {
			 fw.write("Phone_sip_phone_A"+i+"_UCM2_PUB_Sec_v4");
			 if(i!=END)
				 fw.write(",");
		}
		fw.write("],\r\n" + 
				"                 \"Order\" : [\"PhoneLine\",\"PhoneSecurityProfile\",\"Phone\"]\r\n" + 
				"                }\r\n" + 
				"\r\n" + 
				"}");
	}

}
