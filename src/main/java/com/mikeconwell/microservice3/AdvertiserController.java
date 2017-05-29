package com.mikeconwell.microservice3;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdvertiserController {

	public AdvertiserController() {
		// TODO Auto-generated constructor stub
	}
	
	
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value="/api/advertiser",method=RequestMethod.GET)
    public Advertiser advertiser(
    		  @RequestParam(value="name") String name
    		, @RequestParam(value="contact", defaultValue="") String contact
    		, @RequestParam(value="credit_limit", defaultValue="0.0") float credit_limit
    		) {
        return new Advertiser(counter.incrementAndGet()
        		,String.format(template, name)
        		,contact
        		,credit_limit
        		);
    }	
/*
    // PUT = Update new advertiser
    @RequestMapping(value="/api/advertiser",method=RequestMethod.PUT)
    public Advertiser advertiser(@RequestParam(value="name") String name
    		, @RequestParam(value="contact") String contact
    		, @RequestParam(value="credit_limit") Float credit_limit
    		) {
        return new Advertiser(counter.incrementAndGet()
        		,String.format(template, name));
    }	

    // POST = New advertiser
    @RequestMapping(value="/api/advertiser",method=RequestMethod.POST)
    public Advertiser advertiser(@RequestParam(value="name") String name
    		, @RequestParam(value="contact") String contact
    		, @RequestParam(value="credit_limit") Float credit_limit
    		) {
        return new Advertiser(counter.incrementAndGet()
        		,String.format(template, name));
    }	

    // DELETE = Delete Advertiser
    @RequestMapping(value="/api/advertiser",method=RequestMethod.DELETE)
    public Advertiser advertiser(@RequestParam(value="name", defaultValue="World") String name) {
        return new Advertiser(counter.incrementAndGet()
        		,String.format(template, name));
    }	
*/
    
}
