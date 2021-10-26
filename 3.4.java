class PhoneBook {

    private final java.util.Map<String, String> Phones = new java.util.HashMap<>();

    public void addContact(String phone, String name) {
        if(isCorrect(name, phone))
            Phones.put(phone, name);
    }

    public String getNameByPhone(String phone) {
        return Phones.getOrDefault(phone, "");
    }

    public Set<String> getPhonesByName(String query) {
        Set<String> output = new HashSet<String>();
        Phones.forEach((phone, name) -> {
            if (java.util.Objects.equals(name, query))
                output.add(phone);
        });
        return output;
    }

    public StringBuilder getNumbersToString(Set<String> numbers) {
        StringBuilder output = new StringBuilder();
        String delimiter = "";
        for (String number : numbers) {
            output.append(delimiter).append(number);
            delimiter = ", ";
        }
        return output;
    }

    public Set<String> getAllContacts() {
        Set<String> keys = Phones.keySet();
        Set<String> output = new java.util.HashSet<>();
        for (String phone : keys) {
            output.add(Phones.get(phone) + " — " + phone);
        }
        return output;
    }

    public boolean checkContacts(String name) {
        return Phones.containsValue(name);
    }

    public boolean isCorrect(String name, String phone){
        boolean flag = true;

        for(char digit : phone.toCharArray())
            if(!Character.isDigit(digit))
                flag = false;

        for(char digit : name.toCharArray())
            if(!Character.isLetter(digit))
                flag = false;

        return flag && phone.length() == 11;
    }
}
