package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

       /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */

        OutsourcedPart nvidiaGPU = new OutsourcedPart();
        nvidiaGPU.setName("GPU");
        nvidiaGPU.setCompanyName("Nvidia");
        nvidiaGPU.setInv(7);
        nvidiaGPU.setPrice(499.99);
        nvidiaGPU.setId(100L);
        outsourcedPartRepository.save(nvidiaGPU);

        OutsourcedPart amdCpu = new OutsourcedPart();
        amdCpu.setName("CPU");
        amdCpu.setCompanyName("AMD");
        amdCpu.setInv(10);
        amdCpu.setPrice(374.99);
        amdCpu.setId(200L);
        outsourcedPartRepository.save(amdCpu);

        OutsourcedPart evgaPSU = new OutsourcedPart();
        evgaPSU.setName("PSU");
        evgaPSU.setCompanyName("EVGA");
        evgaPSU.setInv(16);
        evgaPSU.setPrice(149.99);
        evgaPSU.setId(300L);
        outsourcedPartRepository.save(evgaPSU);

        OutsourcedPart corsairRAM = new OutsourcedPart();
        corsairRAM.setName("RAM");
        corsairRAM.setCompanyName("Corsair");
        corsairRAM.setInv(8);
        corsairRAM.setPrice(99.99);
        corsairRAM.setId(400L);
        outsourcedPartRepository.save(corsairRAM);

        OutsourcedPart samsungSSD = new OutsourcedPart();
        samsungSSD.setName("SSD");
        samsungSSD.setCompanyName("Samsung");
        samsungSSD.setInv(30);
        samsungSSD.setPrice(319.99);
        samsungSSD.setId(500L);
        outsourcedPartRepository.save(samsungSSD);

        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        /*
        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
