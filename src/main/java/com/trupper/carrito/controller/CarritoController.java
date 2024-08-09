package com.trupper.carrito.controller;

import java.util.List;

import com.trupper.carrito.services.CarritoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.trupper.carrito.model.ListaCompra;
import com.trupper.carrito.model.ListaCompraDetalleRequestVO;
import com.trupper.carrito.model.ListaCompraProductosRequestVO;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class CarritoController {

	@Autowired
	private final CarritoService carritoService;

    public CarritoController(CarritoService carritoService) {
        this.carritoService = carritoService;
    }
	
	/*
	static {
		Cliente c1 = new Cliente((long)710020, "Cliente 710020", true);
		Cliente c2 = new Cliente((long)710020, "Cliente 710020", true);
		Producto p1 = new Producto((long)10200, "Producto1", "P1 desc", true);
		Producto p1 = new Producto((long)10200, "Producto1", "P1 desc", true);
		Producto p1 = new Producto((long)10200, "Producto1", "P1 desc", true);
		Producto p1 = new Producto((long)10200, "Producto1", "P1 desc", true);
		
		Integer productosIds = [18156, 10200, 25020, 10170, 10200, 25020, 10170, ]
		productos.add()
		
		jorgerr@gmail.com
 
arendonb@truper.com
 
cmmartinezs@truper.com
 
iamendezm@truper.com
 
	}*/
	
	@PostMapping("/addListas")
	public ResponseEntity<HttpStatus> addListas(@RequestBody List<ListaCompraDetalleRequestVO> listaCompraDetalleRequestVO) {
		/*
		for (ListaCompraDetalleRequestVO listaCompraDetalleVO : listaCompraDetalleRequestVO) {

			Long idCliente = listaCompraDetalleVO.getClienteId();
			String nombreLista = listaCompraDetalleVO.getNombreLista();
			
			Cliente cliente = new Cliente();
			cliente.setIdCliente(idCliente);
			clienteRepository.save(cliente);
			
			ListaCompra listaCompra = new ListaCompra();
			listaCompra.setNombre(nombreLista);
			listaCompra = listaCompraRepository.save(listaCompra);
			
			for (ListaCompraProductosRequestVO productoCompra : listaCompraDetalleVO.getListaCompraProductosVO()) {
				Producto producto = new Producto();
				producto.setIdProducto(productoCompra.getIdProducto());
				
				ListaCompraDetalle listaCompraDetalle = new ListaCompraDetalle(listaCompra.getIdLista(), producto.getIdProducto());
				listaCompraDetalle.setCantidad(productoCompra.getCantidad());
				listaCompraDetalleRepository.save(listaCompraDetalle);
			}
		}
		*/
		return carritoService.addListas(listaCompraDetalleRequestVO);
		
	}
	
	@GetMapping("/getListaByClienteId/{IdCliente}")
	public ResponseEntity<List<ListaCompra>> getListasDelClienteByIdCliente(@PathVariable Long IdCliente) {
		return carritoService.getListasByIdCliente(IdCliente);
	}
	
	@PutMapping("/updatePreciosCliente/{idCliente}") 
	public ResponseEntity<HttpStatus> updateListaPreciosByClienteId(@PathVariable Long idCliente, List<ListaCompraProductosRequestVO> listaCompraProductosRequestVOs) {
		return carritoService.updateListaPreciosByClienteId(idCliente, listaCompraProductosRequestVOs);
	}
	
	@DeleteMapping("/deleteListaById/{idListaCompra}")
	public ResponseEntity<HttpStatus> deleteListaCompraByIdListaCompra(@PathVariable Long idListaCompra) {
		return carritoService.deleteListaCompraByIdListaCompra(idListaCompra);
	}
}
