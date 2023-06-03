class MainMenu extends PersonalInfo {
    public MainMenu(String name, String birthday, String number, String address, String address1, String address2, String occupation, String status, String course, String school) {
        super(name, birthday, number, address, address1, address2, occupation, status, course, school);
    }


    
    public void openInfoFrame() {
        InfoFrame infoFrame = new InfoFrame(this);
    }
}