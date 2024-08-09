package services;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.trupper.carrito.model.ListaCompra;
import com.trupper.carrito.model.ListaCompraDetalle;
import com.trupper.carrito.model.ListaCompraDetalleRequestVO;
import com.trupper.carrito.model.ListaCompraProductosRequestVO;
import org.springframework.stereotype.Service;

@Service
public interface CarritoService {
	
	public ResponseEntity<HttpStatus> addListas(List<ListaCompraDetalleRequestVO> listaCompraDetalleRequestVO);
	public ResponseEntity<List<ListaCompra>> getListasByIdCliente(Long idCliente);
	public ResponseEntity<HttpStatus> updateListaPreciosByClienteId(Long idCliente, List<ListaCompraProductosRequestVO> listaCompraProductosRequestVOs);
	public ResponseEntity<HttpStatus> deleteListaCompraByIdListaCompra(Long idListaCompra);

}
