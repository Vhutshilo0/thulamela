public class MainApplication {
    public static void main(String[] args) {
        // Sample usage of the backend services
        ReportService reportService = new ReportService();
        LocationService locationService = new LocationService();
        FileUploadService fileUploadService = new FileUploadService();

        // Create a sample report
        ReportService report = new ReportService();
        report.setName("John");
        report.setSurname("Doe");
        report.setIdNumber("1234567890");
        report.setLocation(locationService.getUserLocation());
        report.setCategory("Electricity");
        report.setDescription("Power outage in the area");
        report.setEmergencyLevel("High");

        // Submit the report
        reportService.submitReport(report);

        // Upload a sample file (picture)
        byte[] fileData = "Sample file data".getBytes();
        String fileName = "sample_picture.jpg";
        String fileUrl = fileUploadService.uploadFile(fileData, fileName);
        if (fileUrl != null) {
            System.out.println("File uploaded successfully: " + fileUrl);
        }
    }
}
