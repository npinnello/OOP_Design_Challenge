public class Main {
    public static void main(String[] args) {
        AppCache cache = AppCache.getInstance();

        EnhancementId enhancementId = new EnhancementId("E123");
        ConfigurationData configData = new ConfigurationData("Config for E123");

        // Adding data to the cache
        cache.set(enhancementId, configData);

        // Retrieving data from the cache
        ConfigurationData retrievedData = cache.get(enhancementId);
        System.out.println("Retrieved Config: " + retrievedData);
    }
}
