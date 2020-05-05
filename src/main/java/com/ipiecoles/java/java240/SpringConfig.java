package com.ipiecoles.java.java240;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "com.ipiecoles.java.java240")
public class SpringConfig {
    @Bean
    @Scope("singleton")//équivalent à ne rien mettre ou mettre @Scope("")
    @Qualifier("cache")
    public BitcoinService bitcoinService() {
        System.out.println("Instantiation du bean BitcoinService par Spring");
        BitcoinService bitcoinService = new BitcoinService(/*webPageManager()*/);
        return bitcoinService;
    }
    @Bean
    @Primary
    public BitcoinService bitcoinServiceNoCache(){
        System.out.println("Instantiation du bean BitcoinService sans cache par Spring");
        BitcoinService bitcoinService = new BitcoinService(/*webPageManager()*/);
        bitcoinService.setForceRefresh(true);
        return bitcoinService;

    }

  /*  @Bean
    public WebPageManager webPageManager() {
        System.out.println("Instanciation du WebPageManager par Spring");
        return new WebPageManager();
    }

    @Bean
    public ProduitManager produitManager() {
        System.out.println("Instanciation du ProduitManager par Spring");
        return new ProduitManager(bitcoinServiceNoCache(), webPageManager());
    }
*/
}