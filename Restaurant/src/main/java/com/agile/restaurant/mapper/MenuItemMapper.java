package com.agile.restaurant.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.agile.restaurant.dto.menuItem.MenuItemViewDto;
import com.agile.restaurant.model.MenuItem;

@Mapper()
public interface MenuItemMapper {
	
	@Mapping(source = "restaurant.id", target = "restaurantId")
	@Mapping(source = "restaurant.name", target = "restaurantName")
	MenuItemViewDto toViewDto(MenuItem menuItem);
	List<MenuItemViewDto> toViewDtos(List<MenuItem> menuItems);
}
