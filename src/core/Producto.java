/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.time.LocalDate;

/**
 *
 * @author sviei
 */
public abstract class Producto {
    protected int id;
    protected String nombre;
    protected LocalDate fechaIncio;
    protected LocalDate fechaFin;
    protected boolean estadoActivo;
    protected float valor;
}
