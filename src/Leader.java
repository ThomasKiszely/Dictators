abstract class Leader {
    private String name;
    private String country;
    private int yearsInPower;
    public Leader(String name, String country, int yearsInPower){
        this.name = name;
        this.country = country;
        this.yearsInPower = yearsInPower;
    }

    public String getName() {
        return name;
    }
    public String getCountry() {
        return country;
    }
    public int getYearsInPower() {
        return yearsInPower;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public void setYearsInPower(int yearsInPower) {
        this.yearsInPower = yearsInPower;
    }
   abstract String giveSpeech();

    public void printDetails() {
        System.out.println("This cartoonish dictator is called: " + name + " and comes from " + country + ". He has had " +
                yearsInPower + " years of power");
    }
}
