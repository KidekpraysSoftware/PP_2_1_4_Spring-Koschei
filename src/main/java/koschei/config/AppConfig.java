package koschei.config;

import koschei.models.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {
@Bean
public static Ocean1 getOcean1(Island2 island2) {
    return new Ocean1(island2);
}
    @Bean
    public static Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }

    @Bean
    public static Egg6 getEgg6(Needle7 Needle7) {
        return new Egg6(Needle7);
    }
}
