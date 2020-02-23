package io.cucumber;

import io.cucumber.cucumberexpressions.ParameterByTypeTransformer;
import io.cucumber.cucumberexpressions.ParameterType;
import io.cucumber.cucumberexpressions.ParameterTypeRegistry;
import io.cucumber.datatable.DataTableType;
import io.cucumber.datatable.DataTableTypeRegistry;
import io.cucumber.datatable.TableCellByTypeTransformer;
import io.cucumber.datatable.TableEntryByTypeTransformer;

import java.util.Locale;

public final class TypeRegistry implements cucumber.api.TypeRegistry {

    private final ParameterTypeRegistry parameterTypeRegistry;

    private final DataTableTypeRegistry dataTableTypeRegistry;


    public TypeRegistry(Locale locale) {
        parameterTypeRegistry = new ParameterTypeRegistry(locale);
        dataTableTypeRegistry = new DataTableTypeRegistry(locale);
    }

    public ParameterTypeRegistry parameterTypeRegistry() {
        return parameterTypeRegistry;
    }

    public DataTableTypeRegistry dataTableTypeRegistry() {
        return dataTableTypeRegistry;
    }

    public void defineParameterType(ParameterType parameterType) {
        parameterTypeRegistry.defineParameterType(parameterType);
    }

    public void defineDataTableType(DataTableType tableType) {
        dataTableTypeRegistry.defineDataTableType(tableType);
    }



	@Override
	public void setDefaultParameterTransformer(ParameterByTypeTransformer defaultParameterByTypeTransformer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDefaultDataTableEntryTransformer(TableEntryByTypeTransformer tableEntryByTypeTransformer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDefaultDataTableCellTransformer(TableCellByTypeTransformer tableCellByTypeTransformer) {
		// TODO Auto-generated method stub
		
	}

}