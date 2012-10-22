package beast.app.beauti;

import javax.swing.Box;
import javax.swing.JComponent;

import beast.app.draw.PluginInputEditor;
import beast.core.Input;
import beast.core.Plugin;
import beast.evolution.speciation.SpeciesTreePrior;

public class SpeciesTreePriorInputEditor extends PluginInputEditor {
	private static final long serialVersionUID = 1L;

	public SpeciesTreePriorInputEditor(BeautiDoc doc) {
		super(doc);
	}

	@Override
	public Class<?> type() {
		return SpeciesTreePrior.class;
	}
	
	@Override
	public void init(Input<?> input, Plugin plugin, int itemNr, ExpandOption bExpandOption, boolean bAddButtons) {
		super.init(input, plugin, itemNr, bExpandOption, bAddButtons);
	}

    protected void addComboBox(JComponent box, Input<?> input, Plugin plugin) {
    	m_bAddButtons = true;
    	String label = "Species Tree Population Size";
    	addInputLabel(label, label);
    	m_bAddButtons = false;
    	add(Box.createHorizontalGlue());
    }
}
