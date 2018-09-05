import java.io.File;
import java.io.FileWriter;

public class FeatureConfigGenerator {

	private final static String BIN_PATH = FeatureConfigGenerator.class.getProtectionDomain().getCodeSource().getLocation().getPath();
	
	public static void main(String[] args) {
		try {
			File file = new File(BIN_PATH.substring(0, BIN_PATH.length() - 4) + "/src/featureconfig4.py");
			FileWriter fw = new FileWriter(file);
			
			
			FeatureWriter.initital(fw);
			FeatureWriter.writePhoneParams(fw);
			FeatureWriter.writeMacAddress(fw);
			FeatureWriter.writeDNs(fw);
			FeatureWriter.writePhoneLines(fw);
			FeatureWriter.writePhoneParameters(fw);
			FeatureWriter.writePhoneSecurityProfile(fw);
			FeatureWriter.writePhone(fw);
			FeatureWriter.writeConfigurationList(fw);
			
			fw.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Success!" );
	}
}
