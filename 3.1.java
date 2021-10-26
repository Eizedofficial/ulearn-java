public static float randFloat(float min, float max) {
        java.util.Random rand = new java.util.Random();
        float randValue = rand.nextFloat() * (max - min) + min;
        DecimalFormat df = new DecimalFormat("##.##");
        return Float.parseFloat(df.format(randValue).replace(',', '.'));
    }

    public static float[] generatePatientsTemperatures(int patientsCount) {
        float[] temperatures = new float[patientsCount];
        for (int i = 0; i < patientsCount; i++) {
            temperatures[i] = randFloat(32, 40);
        }

        return temperatures;
    }

    public static String getReport(float[] temperatureData) {
        StringBuilder tempListText = new StringBuilder();
        float medianTemp = 0F;
        int healthyCounter = 0;

        for (float record : temperatureData) {
            tempListText.append(" ").append(String.valueOf(record).replace(".", ","));
            medianTemp += record;
            if (record >= 36.2 && record <= 36.9)
                healthyCounter++;
        }
        medianTemp /= temperatureData.length;
        String medianTempText = new DecimalFormat("##.##").format(medianTemp);

        return "Температуры пациентов:" + tempListText + "\nСредняя температура: " + medianTempText + "\nКоличество здоровых: " + healthyCounter;
    }
