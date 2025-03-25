import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

class AppCache {
    private static volatile AppCache instance;
    private final Map<EnhancementId, ConfigurationData> cache;

    private AppCache() {
        cache = new ConcurrentHashMap<>();
    }

    public static AppCache getInstance() {
        if (instance == null) {
            synchronized (AppCache.class) {
                if (instance == null) {
                    instance = new AppCache();
                }
            }
        }
        return instance;
    }

    public void set(EnhancementId enhancementId, ConfigurationData configurationData) {
        cache.put(enhancementId, configurationData);
    }

    public ConfigurationData get(EnhancementId enhancementId) {
        return cache.get(enhancementId);
    }
}
