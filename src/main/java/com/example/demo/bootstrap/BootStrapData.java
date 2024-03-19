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
        OutsourcedPart switches = new OutsourcedPart();
        switches.setCompanyName("Ryan's Mechanical Keyboard Store");
        switches.setName("Keyboard Switches");
        switches.setInv(1000);
        switches.setPrice(0.50);
        switches.setId(1);
        switches.setMaxInv(10000);
        switches.setMinInv(1);
        outsourcedPartRepository.save(switches);

        OutsourcedPart keycaps = new OutsourcedPart();
        keycaps.setName("Keycap Set");
        keycaps.setInv(50);
        keycaps.setPrice(100.0);
        keycaps.setId(2);
        keycaps.setMaxInv(1000);
        keycaps.setMinInv(1);
        outsourcedPartRepository.save(keycaps);

        OutsourcedPart cases = new OutsourcedPart();
        cases.setName("Keyboard Case");
        cases.setInv(50);
        cases.setPrice(120.0);
        cases.setId(3);
        cases.setMaxInv(500);
        cases.setMinInv(1);
        outsourcedPartRepository.save(cases);

        OutsourcedPart pcb = new OutsourcedPart();
        pcb.setName("Keyboard PCB");
        pcb.setInv(50);
        pcb.setPrice(60.0);
        pcb.setId(4);
        pcb.setMaxInv(500);
        pcb.setMinInv(1);
        outsourcedPartRepository.save(pcb);

        OutsourcedPart stabilizers = new OutsourcedPart();
        stabilizers.setName("Stabilizer Set");
        stabilizers.setInv(50);
        stabilizers.setPrice(25.0);
        stabilizers.setId(5);
        stabilizers.setMaxInv(300);
        stabilizers.setMinInv(1);
        outsourcedPartRepository.save(stabilizers);
         */

        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        if(thePart != null) {
            System.out.println(thePart.getCompanyName());
        } else {
            System.out.println("Part is not found or does not exist.");
        }
        /*
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }
        */
        /*
        Product fullSize= new Product("Full-Size Keyboard",100.0,15);
        Product tenKeyLess= new Product("TKL Keyboard",90.0,15);
        Product keyboard75= new Product("75% Keyboard",80.0,15);
        Product keyboard60= new Product("60% Keyboard",70.0,15);
        Product keyboard40= new Product("40% Keyboard",60.0,15);
        productRepository.save(fullSize);
        productRepository.save(tenKeyLess);
        productRepository.save(keyboard75);
        productRepository.save(keyboard60);
        productRepository.save(keyboard40);
        */

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
