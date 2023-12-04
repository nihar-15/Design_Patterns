/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trainticketbooking;

/**
 *
 * @author ACER
 */

 public class TicketBuilder {
        private String ticketClass;
        private double price,time;
        String category;
        String source,destination;
        int trno;
        
        
        

    public  TicketBuilder setSource(String source) {
        this.source = source;
         return this;
        
    }

    public  TicketBuilder setDestination(String destination) {
        this.destination = destination;
         return this;
    }

    public TicketBuilder setTrno(int trno) {
        this.trno = trno;
        return this;
    }

        public TicketBuilder setTicketClass(String ticketClass) {
            this.ticketClass = ticketClass;
            return this;
        }

        public TicketBuilder setPrice(double price) {
            this.price = price;
            return this;
        }

        public TicketBuilder setCategory(String category) {
            this.category = category;
            return this;
        }

    public TicketBuilder setTime(double time) {
        this.time = time;
        return this;
    }
        
        

        public Ticket build() {
            // Validate required fields here if necessary
            return new Ticket(0,null, 0, null,0,null,null);
        }
    }
