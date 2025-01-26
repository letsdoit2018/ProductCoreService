package com.letsdoit.core.product.util;

import org.springframework.context.event.EventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.UUID;

@Component
public class PartnerVariantDomainListener<T> {
    @EventListener
    public void onBeforeConvert(BeforeConvertEvent<T> event){
        Object obj =  event.getSource();
        try {
            Field docID= obj.getClass().getDeclaredField("id");
            docID.setAccessible(true);
            Object value = docID.get(obj);
            if(value == null) {

                value=  UUID.randomUUID().toString();
                docID.set(obj,value);
            }
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
