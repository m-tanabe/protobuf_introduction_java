import com.section06.models.Company;

public class OneofDemo {
    public static void main(String[] args) {
        // normal pattern
        Company company = Company.newBuilder()
                .setCompanyCode(100)
                .build();


        // multi select pattern
        Company company2 = Company.newBuilder()
                .setCompanyCode(100)
                .setCompanyName("panasonic")
                .build();

        System.out.println("company2 = " + company2.toString());


        // not set pattern
        Company company3 = Company.newBuilder()
                .build();

        System.out.println("company3 = " + company3.toString());

        // check select name
        switch(company3.getCompanyInfoCase().name()){
            case "COMPANY_CODE":
                System.out.println("company_code=" + company.getCompanyCode());
                break;
            case "COMPANY_NAME":
                System.out.println("company_name=" + company.getCompanyName());
                break;
            default:
                System.out.println("company not set");
                break;
        }
    }
}
