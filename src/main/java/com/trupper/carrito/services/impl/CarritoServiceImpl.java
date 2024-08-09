package com.trupper.carrito.services.impl;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.trupper.carrito.services.CarritoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.trupper.carrito.model.Cliente;
import com.trupper.carrito.model.ListaCompra;
import com.trupper.carrito.model.ListaCompraDetalle;
import com.trupper.carrito.model.ListaCompraDetallePK;
import com.trupper.carrito.model.ListaCompraDetalleRequestVO;
import com.trupper.carrito.model.ListaCompraProductosRequestVO;
import com.trupper.carrito.model.Producto;
import com.trupper.carrito.repository.ClienteRepository;
import com.trupper.carrito.repository.ListaCompraDetalleRepository;
import com.trupper.carrito.repository.ListaCompraRepository;
import com.trupper.carrito.repository.ProductoRepository;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarritoServiceImpl implements CarritoService {
	
	@Autowired
	private final ClienteRepository clienteRepository;
	
	@Autowired
	private final ProductoRepository productoRepository;
	
	@Autowired
	private final ListaCompraRepository listaCompraRepository;
	
	@Autowired
	private final ListaCompraDetalleRepository listaCompraDetalleRepository;
	
	public ResponseEntity<HttpStatus> addListas(List<ListaCompraDetalleRequestVO> listaCompraDetalleRequestVO) {
		
		for (ListaCompraDetalleRequestVO listaCompraDetalleVO : listaCompraDetalleRequestVO) {

			Long idCliente = listaCompraDetalleVO.getIdCliente();
			String nombreLista = listaCompraDetalleVO.getNombreLista();
			
			Cliente cliente = new Cliente();
			cliente.setIdCliente(idCliente);
			clienteRepository.save(cliente);
			
			ListaCompra listaCompra = new ListaCompra();
			listaCompra.setNombre(nombreLista);
			listaCompra.setCustomerId(idCliente);
			listaCompra = listaCompraRepository.save(listaCompra);
			
			for (ListaCompraProductosRequestVO productoCompra : listaCompraDetalleVO.getListaCompraProductosVO()) {
				Producto producto = new Producto();
				producto.setIdProducto(productoCompra.getIdProducto());
				producto.setDescripcion(producto.getDescripcion());
				producto.setActivo(productoCompra.isActivo());
				productoRepository.save(producto);
				
				//ListaCompraDetalle listaCompraDetalle = new ListaCompraDetalle(listaCompra.getIdLista(), producto.getIdProducto());
				ListaCompraDetalle listaCompraDetalle = new ListaCompraDetalle();
				listaCompraDetalle.setIdListaCompraDetallePK(new ListaCompraDetallePK(listaCompra.getIdLista(), producto.getIdProducto()));
				listaCompraDetalle.setCantidad(productoCompra.getCantidad());
				listaCompraDetalleRepository.save(listaCompraDetalle);
			}
		}
		
		return new ResponseEntity<>(HttpStatus.OK);
		
	}
	
	public ResponseEntity<List<ListaCompra>> getListasByIdCliente(Long idCliente) {
		List<ListaCompra> listaCompras = listaCompraRepository.getListaCompras(idCliente);
		return new ResponseEntity(listaCompras, HttpStatus.OK);
	}
	
	public ResponseEntity<HttpStatus> updateListaPreciosByClienteId(Long idCliente, List<ListaCompraProductosRequestVO> listaCompraProductosRequestVOs) {		
		Map productosMap = listaCompraProductosRequestVOs.stream().collect(Collectors.toMap(ListaCompraProductosRequestVO::getIdProducto, ListaCompraProductosRequestVO::getCantidad, null));		
		//List<ListaCompra> listaCompras = listaCompraRepository.getListaCompras(idCliente);
		
		//listaCompras.forEach(entity -> {
		//	ListaCompraDetalle det = entity.getListaCompraDetalle();
		//	det.setCantidad( (int)productosMap.get(entity.getListaCompraDetalle().getIdProducto()));
		//});
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	public ResponseEntity<HttpStatus> deleteListaCompraByIdListaCompra(Long idListaCompra) {
		listaCompraRepository.deleteById(idListaCompra);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
