package com.ipiecoles.java.java240;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import javax.annotation.Resource;

public class ConsoleRunner implements CommandLineRunner {

    @Autowired
    private ProduitManager pm;

    @Resource(name = "bitcoinServiceCacheProperty")
    private  BitcoinService bitcoinServiceWithoutCache;

    public void run(String...arg)
}
