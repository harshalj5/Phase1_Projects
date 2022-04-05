package projectassessment;

public class BusinessOperations {


		public static void main(String[] args) {
			
			// Create "main" folder if not present in current folder structure
			FileOperations.createMainFolderIfNotPresent("main");
			
			MenuOptions.printWelcomeScreen("File Operations", "Harshal Jumnake");
			
			HandleOperations.handleWelcomeScreenInput();
		}
}
