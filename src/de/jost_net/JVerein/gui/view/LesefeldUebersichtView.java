/**********************************************************************
 * $Source$
 * $Revision$
 * $Date$
 * $Author$
 *
 * Copyright (c) by Heiner Jostkleigrewe
 * This program is free software: you can redistribute it and/or modify it under the terms of the 
 * GNU General Public License as published by the Free Software Foundation, either version 3 of the 
 * License, or (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,  but WITHOUT ANY WARRANTY; without 
 *  even the implied warranty of  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See 
 *  the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with this program.  If not, 
 * see <http://www.gnu.org/licenses/>.
 * 
 * heiner@jverein.de
 * www.jverein.de
 **********************************************************************/
package de.jost_net.JVerein.gui.view;

import de.jost_net.JVerein.JVereinPlugin;
import de.jost_net.JVerein.gui.parts.LesefeldUebersichtPart;
import de.jost_net.JVerein.rmi.Mitglied;
import de.willuhn.jameica.gui.AbstractView;
import de.willuhn.jameica.gui.GUI;

public class LesefeldUebersichtView extends AbstractView
{

  @Override
  public void bind() throws Exception
  {
    GUI.getView().setTitle(JVereinPlugin.getI18n().tr("Lesefeld-Definitionen"));

    LesefeldUebersichtPart lesefeldEinstellungPart = new LesefeldUebersichtPart(
        (Mitglied) getCurrentObject());
    lesefeldEinstellungPart.paint(this.getParent());
  }

  @Override
  public String getHelp()
  {
    return "<form><p><span color=\"header\" font=\"header\">Lesefeld-Definitionen</span></p>"
        + "<p>Lesefelder werden durch Skripte konfiguriert. Jedes Skript kann f�r jedes "
        + "Mitglied aufgerufen werden und erstellt so f�r jedes Mitglied ein Feld, das "
        + "nur gelesen werden kann. Skripte k�nnen auf alle Daten des jeweiligen "
        + "Mitgliedes zugreifen und diese weiterverarbeiten.</p>"
        + "<p>F�r mehr Informationen und Beispiele mit Hilfe-Knopf klicken.</p></form>";
    
    
  }
}