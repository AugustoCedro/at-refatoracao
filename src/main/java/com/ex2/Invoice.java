package com.ex2;

public class Invoice {
    public String clientName;
    public String clientEmail;
    public double amount;
    public InvoiceType type;

    public void enviarPorEmail(String email, String conteudo) {
        System.out.println("Enviando email para: " + email);
        System.out.println("Conteúdo:\n" + conteudo);
    }

    public void process() {
        if (clientEmail == null && !clientEmail.contains("@")) {
            System.out.println("Email inválido. Falha no envio.");
        }

        if (type == InvoiceType.SIMPLES) {
            System.out.println("Nota fiscal simples");
        } else if (type == InvoiceType.TAXADO) {
            System.out.println("Nota fiscal com imposto");
        } else if (type == InvoiceType.DESCONHECIDO) {
            // caso nunca ocorre, mas está presente
            System.out.println("Nota fiscal fantasma");
        } else {
            System.out.println("Tipo desconhecido");
        }
        //imprimir nota
        System.out.println("--- NOTA FISCAL ---");
        System.out.println("Cliente: " + clientName);
        System.out.println("Valor: R$ " + amount);

        if (type == InvoiceType.SIMPLES) {
            System.out.println("Tipo: Simples");
        } else if (type == InvoiceType.TAXADO) {
            System.out.println("Tipo: Com imposto");
        } else {
            System.out.println("Tipo: Desconhecido");
        }
        System.out.println("---------------------");
        // Enviar nota para email
        System.out.println("Enviando nota fiscal para: " + clientEmail);
        String nota = "--- NOTA FISCAL ---\n" +
                "Cliente: " + clientName + "\n" +
                "Valor: R$ " + amount + "\n" +
                "Tipo: " + (type == InvoiceType.SIMPLES ? "Simples" : type == InvoiceType.TAXADO ? "Com imposto" : "Desconhecido") + "\n" +
                "---------------------";
        enviarPorEmail(clientEmail, nota);
    }
}