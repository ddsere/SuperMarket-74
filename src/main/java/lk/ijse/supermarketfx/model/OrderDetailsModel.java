package lk.ijse.supermarketfx.model;

import lk.ijse.supermarketfx.dto.OrderDetailsDTO;
import lk.ijse.supermarketfx.dao.SQLUtil;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * --------------------------------------------
 * Author: Shamodha Sahan
 * GitHub: https://github.com/shamodhas
 * Website: https://shamodha.com
 * --------------------------------------------
 * Created: 4/24/2025 9:32 AM
 * Project: SupermarketFX
 * --------------------------------------------
 **/

public class OrderDetailsModel {
    private final ItemModel itemModel = new ItemModel();

    public boolean saveOrderDetailsList(ArrayList<OrderDetailsDTO> cartList) throws SQLException {
        for (OrderDetailsDTO orderDetailsDTO : cartList) {
            boolean isDetailsSaved = saveOrderDetails(orderDetailsDTO);
            if (!isDetailsSaved) {
                return false;
            }

            boolean isUpdated = itemModel.reduceQty(orderDetailsDTO);
            if (!isUpdated) {
                return false;
            }

            // other tables
        }
        return true;
    }

    private boolean saveOrderDetails(OrderDetailsDTO dto) throws SQLException {
        return SQLUtil.execute(
                "insert into order_details values (?,?,?,?)",
                dto.getOrderId(),
                dto.getItemId(),
                dto.getQty(),
                dto.getPrice()
        );
    }
}
